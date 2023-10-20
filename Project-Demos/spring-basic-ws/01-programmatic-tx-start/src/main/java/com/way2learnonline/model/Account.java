package com.way2learnonline.model;

import java.util.Set;

public class Account {
	
	private Long accountNumber;
	private String name;
	private boolean isActive;
	
	
	private Set<Benificiary> benificiaries;
	
	private String city;
	private String country;
	
	private int balance;
	private String emailAddress;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	

	public Account(Long accountNumber, String name, boolean isActive,
		 int balance, String emailAddress,String city,String country) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.isActive = isActive;	
		this.balance = balance;
		this.emailAddress = emailAddress;
		
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+name+ " Acc number="+accountNumber+" city"+city+" Country= "+country;
	}

	public void debit(int amount){
		balance-=amount;
	}
	
	public void credit(int amount){
		balance+=amount;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Set<Benificiary> getBenificiaries() {
		return benificiaries;
	}

	public void setBenificiaries(Set<Benificiary> benificiaries) {
		this.benificiaries = benificiaries;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	
	

}
