package com.xiaolong.svc;

import java.util.List;

import com.xiaolong.model.User;

public interface UserSvc {
	public String getPasswordByUserId(int id);
	public List<User> listUser();

}
