package demo;

import java.util.List;
import java.util.ArrayList;

import demo.Accommodation;
import demo.Customer;

public class Resort {
	private String name;
	private Address address;
	private List<Accommodation> lisacc = new ArrayList<>();
	private List<Customer> liscus = new ArrayList<>();
	public Resort() {
		super();
	}
	public Resort(String name, Address address, ArrayList<Accommodation> lisacc, ArrayList<Customer> liscus) {
		super();
		this.name = name;
		this.address = address;
		this.lisacc = lisacc;
		this.liscus = liscus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Accommodation> getLisacc() {
		return lisacc;
	}
	public void setLisacc(ArrayList<Accommodation> lisacc) {
		this.lisacc = lisacc;
	}
	public List<Customer> getLiscus() {
		return liscus;
	}
	public void setLiscus(ArrayList<Customer> liscus) {
		this.liscus = liscus;
	}
}
