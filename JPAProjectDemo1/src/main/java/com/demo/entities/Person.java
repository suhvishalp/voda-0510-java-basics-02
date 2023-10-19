package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

	@Id
	private int personId;
	private String fistName;
	
	public Person() {
		super();
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return fistName;
	}

	public void setName(String name) {
		this.fistName = name;
	}
	
	
}
