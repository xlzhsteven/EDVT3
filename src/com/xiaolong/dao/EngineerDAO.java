package com.xiaolong.dao;

import java.util.List;

import com.xiaolong.model.Engineer;

public interface EngineerDAO {
	public void addEngineer(Engineer engineer);
	public void removeEngineer(Engineer engineer);
	public List<Engineer> listAll();
}
