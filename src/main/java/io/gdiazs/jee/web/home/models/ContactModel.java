package io.gdiazs.jee.web.home.models;

public class ContactModel {

	private String name;
	
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactModel [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
