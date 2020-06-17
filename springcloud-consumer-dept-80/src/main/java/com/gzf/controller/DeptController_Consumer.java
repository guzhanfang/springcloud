package com.gzf.controller;

import java.util.List;

import com.gzf.bean.Dept;
import com.gzf.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class DeptController_Consumer
{

//	private static final String REST_URL_PREFIX = "http://localhost:8001";
//	private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEPT";
//
//	/**
//	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
//	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
//	 */
//	@Autowired
//	private RestTemplate restTemplate;
//	@Autowired
//	private DiscoveryClient client;
//	@RequestMapping("/consumer/dept/add")
//	public boolean add(Dept dept){
//		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
//	}
//	@RequestMapping("/consumer/dept/get/{id}")
//	public Dept get(@PathVariable("id")long id){
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
//	}
//	@RequestMapping("/consumer/dept/list")
//	public List<Dept> list(){
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
//	}
//	@RequestMapping("/consumer/dept/del")
//	public void del(Dept dept){
//		System.out.println(dept);
//		restTemplate.delete(REST_URL_PREFIX+"/dept/del/"+dept.getDeptno());
//	}
//	@RequestMapping("/consumer/dept/discovery")
//	public Object discoveryClient(){
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
//	}
	/**
	 * 以下整合feign采用接口形式调用微服务
	 *
	 */
	@Autowired
	private DeptClientService service = null;


	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}


	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}


	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}

}
