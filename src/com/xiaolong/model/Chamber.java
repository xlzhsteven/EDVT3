package com.xiaolong.model;

public class Chamber {
	int id;
	String name;
	String location;
	ProjectManagement projectManagement = new ProjectManagement();
	
	public Chamber() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Chamber [id=" + id + ", name=" + name + ", location="
				+ location + "]";
	}

}
