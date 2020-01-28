package com.agency.bank;

public class Main {

	public static void main(String[] args) {
		Agency agency = new Agency();
		agency.insert(new Customer("João", 22));
		agency.insert(new Customer("Maria", 30));
		agency.insert(new Customer("José", 25));
		agency.insert(new Customer("Alice", 22));
		agency.getCustomers();
		
		agency.remove();
		agency.remove();
		agency.remove();
		agency.remove();
		
		agency.getCustomers();
		
	}

}
