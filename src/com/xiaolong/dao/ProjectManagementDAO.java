package com.xiaolong.dao;

import java.util.List;

import com.xiaolong.model.Chamber;
import com.xiaolong.model.Engineer;
import com.xiaolong.model.Project;
import com.xiaolong.model.ProjectManagement;

public interface ProjectManagementDAO {
	public void assignProject(Project project, Engineer engineer, Chamber chamber);
	public List<ProjectManagement> listAll();
}
