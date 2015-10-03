package com.hust.kiwi.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.hust.kiwi.repository.entites.User;
import com.hust.kiwi.repository.ui.UsersRepository;
import com.hust.kiwi.service.ui.UsersService;

@Named
@SessionScoped
public class UsersServiceImpl implements UsersService, Serializable {
	private static final long serialVersionUID = 8697612615441399820L;

	@Inject
	private UsersRepository userRepo;

	/* find all User */
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	/* delete User */
	@Override
	public User remove(User user) {

		return userRepo.save(user);
	}

	/* add or update User base on primary key */
	@Override
	public User add_or_update(User entity) {

		return userRepo.save(entity);
	}

	/* find by Full Name */
	@Override
	public List<User> findByFullName() {
		return userRepo.findByFullName();
	}

	/* find by user name */
	@Override
	public User findByUserName(String userName) {
		try {
			List<User> listUser = userRepo.findByUserName(userName);
			return listUser.get(0);
		} catch (Exception e) {
			return null;
		}

	}

	/* Check Login */
	@Override
	public boolean checkLogin(String userName, String password) {
		try {
			User user = findByUserName(userName);
			if (user.getUserName() != null) {
				if (user.getPassword().equals(password))
					return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

}
