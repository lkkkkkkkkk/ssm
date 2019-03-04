package com.entor.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.entor.entity.Classes;
/**
 * 泛型父接口
 * @author Administrator
 *
 * @param <T>
 */
public interface BaseDao<T> {

	public void add(T t);
	public void addMore(List<T> list);
	public void delete(Class<T> cls,Serializable id);
	public void deleteMore(Class<T> cls,String ids);
	public void update(T t);
	public T queryById(Class<T> cls,Serializable id);
	public List<T> queryAll(Class<T> cls);
	public List<T> queryByPage(Class<T> cls,Map<String,Integer> map);
	public int getTotals(Class<T> cls);
}
