package com.agency.bank;

import java.util.ArrayList;
import java.util.List;

public class Agency {
	private List<Customer> listCustomers;

	public Agency() {
		this.listCustomers = new ArrayList<Customer>();
	}

	public void remove() {
		if (!this.listCustomers.isEmpty()) {
			Customer customer = this.listCustomers.get(0);
			for (int i = 0; i < this.listCustomers.size(); i++) {
				if(customer.getAge() < this.listCustomers.get(i).getAge()) {
					customer = this.listCustomers.get(i);
					break;
				} else if(customer.getOrder() > this.listCustomers.get(i).getOrder()) {
					customer = this.listCustomers.get(i);
					break;
				}
			}
			System.out.println(" " + customer.getName() + ", " + customer.getAge());
			this.listCustomers.remove(customer);
		}
	}

	public void insert(Customer customer) {
		this.listCustomers.add(customer);
	}

	public void getCustomers() {
		System.out.println("\n----------Customers----------\n");
		if (!this.listCustomers.isEmpty()) {
			for (int i = 0; i < this.listCustomers.size(); i++) {
				System.out.println(" order = " + this.listCustomers.get(i).getOrder());
				System.out.println(" name = " + this.listCustomers.get(i).getName());
				System.out.println(" age = " + this.listCustomers.get(i).getAge() + "\n");
			}
		} else {
			System.out.println("Empty List.");
		}
		System.out.println("\n-----------------------------");
	}

}
