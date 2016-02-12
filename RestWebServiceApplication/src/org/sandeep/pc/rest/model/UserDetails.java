package org.sandeep.pc.rest.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "User")
public class UserDetails {

	private long id;
	private String firstName;
	private String lastName;
	// private Date dob;
	private String sdf = null;

	public UserDetails() {
	}

	public UserDetails(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sdf = new SimpleDateFormat().format(new Date());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getSdf() {
		return sdf;
	}

	public void setSdf(String sdf) {
		this.sdf = sdf;
	}

}
