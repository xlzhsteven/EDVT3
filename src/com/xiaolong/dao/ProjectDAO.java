package com.xiaolong.dao;

import java.util.List;

import com.xiaolong.model.Project;

public interface ProjectDAO {
	public void addProject(Project project);
	public void removeProject(Project project);
	public List<Project> listAll();
}
