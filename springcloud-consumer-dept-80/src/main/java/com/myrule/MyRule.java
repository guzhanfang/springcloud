package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/5/5
 * @Introduce
 */
@Configuration
public class MyRule {
    @Bean
    public IRule iRule(){
        return new TestRule();
    }
}
