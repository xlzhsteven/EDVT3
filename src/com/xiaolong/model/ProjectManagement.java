package com.xiaolong.model;

public class ProjectManagement {
	int id;
	int chamberId;
	int engineerId;
	int projectId;

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
