package com.hust.kiwi.Controller;

import java.util.List;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.hust.kiwi.repository.entites.User;
import com.hust.kiwi.service.ui.UsersService;

import java.io.Serializable;

@Named
@SessionScoped
public class UserController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3066198849582745771L;
	@Inject
	private UsersService _usersService;
	private String userName;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String pass;
	private String message;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	private User user;
	private List<User> listUser;

	/* set ,get and Constructor */

	public User getUser() {
		if (user == null)
			user = new User();
		return this.user;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserController() {

	}

	/* list all Users */
	public String getAllUsers() {
		if (_usersService.findAll() == null)
			return "welcome";
		
		return "Login";
	}

	/* check Login */
	
	public String check() {
		if (_usersService.checkLogin(userName, pass))
			return "welcome";
		else
			
			return "hello";
	}
}
