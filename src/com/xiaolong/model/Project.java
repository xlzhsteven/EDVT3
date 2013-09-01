package com.xiaolong.model;

import java.util.Date;

public class Project {
	int id;
	String name;
	Date starting_date;
	
	public Project(){}

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

	public Date getStarting_date() {
		return starting_date;
	}

	public void setStarting_date(Date starting_date) {
		this.starting_date = starting_date;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", starting_date="
				+ starting_date + "]";
	}

}
