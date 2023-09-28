package com.wwordle.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	private String username;
    private String name;
    private short yob;
    private String email;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getId() {
		return this.id;
	}
		
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getYob() {
		return this.yob;
	}

	public void setYob(short yob) {
		this.yob = yob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public User(String name, String email, Short Yob){
        setName(name);
        setEmail(email);
        setYob(Yob);
    }
}