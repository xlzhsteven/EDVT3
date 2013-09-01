package com.xiaolong.model;

public class Engineer {
	int id;
	String firstName;
	String lastName;
	String title;

	public Engineer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Engineer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", title=" + title + "]";
	}

}
