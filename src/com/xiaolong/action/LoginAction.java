package com.xiaolong.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaolong.model.User;
import com.xiaolong.svc.UserSvc;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2918648783120372793L;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private UserSvc userSvc;

	public UserSvc getUserSvc() {
		return userSvc;
	}

	public void setUserSvc(UserSvc userSvc) {
		this.userSvc = userSvc;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if(getUser().getPassword().length()==0){
			addFieldError("user.password", "no password");
		}
		if(!getUser().getPassword().equals(userSvc.getPasswordByUserId(1))){
			addFieldError("user.password", "Wrong password");
		}
	}

}
