package model;

import java.util.Date;

public class Person {
	private Integer id;
	private String name;
	private String firstName;
	private String email;
	private String webAddress;
	private Date birthday;
	private String password;

	public Person() {
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

}
