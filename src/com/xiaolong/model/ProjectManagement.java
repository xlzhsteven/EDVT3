package com.xiaolong.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectManagement {
	int id;
	int chamberId;
	int engineerId;
	int projectId;
	List<Chamber> chamberList = new ArrayList<>();
	List<Engineer> engineerList = new ArrayList<>();
	List<Project> projectList = new ArrayList<>();

	public List<Chamber> getChamberList() {
		return chamberList;
	}

	public void setChamberList(List<Chamber> chamberList) {
		this.chamberList = chamberList;
	}

	public List<Engineer> getEngineerList() {
		return engineerList;
	}

	public void setEngineerList(List<Engineer> engineerList) {
		this.engineerList = engineerList;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public ProjectManagement() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChamberId() {
		return chamberId;
	}

	public void setChamberId(int chamberId) {
		this.chamberId = chamberId;
	}

	public int getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "ProjectManagement [id=" + id + ", chamberId=" + chamberId
				+ ", engineerId=" + engineerId + ", projectId=" + projectId
				+ "]";
	}

}
