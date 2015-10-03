package com.hust.kiwi.service.ui;
import java.util.List;

import com.hust.kiwi.repository.entites.User;


public interface UsersService extends BaseService<User> {
	
	public List<User> findByFullName();
	public User findByUserName(String userName);
	public boolean checkLogin(String userName ,String password);
}
