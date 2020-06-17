package com.gzf.service;

import com.gzf.bean.Dept;

import java.util.List;


public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
	public int del(long deptNo);
}
