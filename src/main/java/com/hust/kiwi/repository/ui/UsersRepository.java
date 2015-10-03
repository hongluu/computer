package com.hust.kiwi.repository.ui;

import java.io.Serializable;
import java.util.List;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.hust.kiwi.repository.entites.User;

@Repository(forEntity = User.class)
public interface UsersRepository extends EntityRepository<User, Serializable> {
	
	public List<User> findByUserName(String userName);

	public List<User> findByFullName();

	
}
