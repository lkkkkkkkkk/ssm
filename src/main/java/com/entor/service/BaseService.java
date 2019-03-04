package com.entor.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T> {

	public void add(T t);
	public void addMore(List<T> list);
	public void delete(Class<T> cls,Serializable id);
	public void deleteMore(Class<T> cls,String ids);
	public void update(T t);
	public T queryById(Class<T> cls,Serializable id);
	public List<T> queryAll(Class<T> cls);
	public List<T> queryByPage(Class<T> cls,int currentPage, int pageSize);
	public int getTotals(Class<T> cls);
}
