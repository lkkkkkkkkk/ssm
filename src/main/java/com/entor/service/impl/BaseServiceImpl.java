package com.entor.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.BaseDao;
import com.entor.service.BaseService;
@Service("baseService")
public class BaseServiceImpl<T> implements BaseService<T>{

	@Resource
	private BaseDao<T> baseDao;
	@Override
	public void add(T t) {
		baseDao.add(t);
	}

	@Override
	public void addMore(List<T> list) {
		baseDao.addMore(list);
	}

	@Override
	public void delete(Class<T> cls, Serializable id) {
		baseDao.delete(cls, id);		
	}

	@Override
	public void deleteMore(Class<T> cls, String ids) {
		baseDao.deleteMore(cls, ids);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public T queryById(Class<T> cls, Serializable id) {
		return baseDao.queryById(cls, id);
	}

	@Override
	public List<T> queryAll(Class<T> cls) {
		return baseDao.queryAll(cls);
	}

	@Override
	public List<T> queryByPage(Class<T> cls, int currentPage, int pageSize) {
		Map<String,Integer> map = new HashMap<>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pagesize", pageSize);
		return baseDao.queryByPage(cls,map);
	}

	@Override
	public int getTotals(Class<T> cls) {
		// TODO Auto-generated method stub
		return baseDao.getTotals(cls);
	}

}
