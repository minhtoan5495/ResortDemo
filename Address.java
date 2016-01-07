package demo;

public class Address {
	private String add;
	private String city;
	private String country;
	public Address() {
	}
	public Address(String add, String city, String country) {
		this.add = add;
		this.city = city;
		this.country = country;
	}	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
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
	@Override
	public String toString() {
		return "Address [add=" + add + ", city=" + city + ", country=" + country + "]";
	}	
}