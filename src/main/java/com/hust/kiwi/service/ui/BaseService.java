package com.hust.kiwi.service.ui;

import java.util.List;

public interface BaseService<T> {
	public List<T> findAll(); 
	public T add_or_update(T entity);
	public T remove(T entity);
}
