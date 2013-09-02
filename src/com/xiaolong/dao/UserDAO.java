package com.xiaolong.dao;

import java.util.List;

import com.xiaolong.model.User;

public interface UserDAO {
	public String getPasswordByUserId(int id);
	public List<User> listUser();

}
