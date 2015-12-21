package com.zhc.myt.MytService;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhc.myt.MytCommon.ReturnPage;


public interface BaseService<T> {

	
	@Transactional(rollbackFor=Exception.class) 
	public void add(T t) ;

	@Transactional(rollbackFor=Exception.class) 
	public void delete(T t);

	@Transactional(rollbackFor=Exception.class) 
	public void update(T t);

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public T getById(int id);

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public ReturnPage<T> getByPage(Integer pageNumber, Integer pageSize,
			Map<String, Object> params);

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<T> getByList(Map<String, Object> params);

}
