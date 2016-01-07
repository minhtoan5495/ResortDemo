package demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements CustomerManagement {
	private String name;
	private String dateIn;
	private String dateOut;
	private Accommodation accommodation;
	public Customer() {
		super();
	}
	public Customer(String name, String dateIn, String dateOut, Accommodation accommodation) {
		super();
		this.name = name;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.accommodation = accommodation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public Accommodation getAccommodation() {
		return accommodation;
	}
	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}
	@Override
	public Date convertStringToDate(String dateString){
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");		 
		Date date = null;
		try {
			date = df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	@Override
	public String convertDateToString(Date date){
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");	
		String dateString = df.format(date);
		return dateString;
	}
	@Override
	public float checkOut(){
		Date dateStart = convertStringToDate(dateIn);
		Date dateStop = convertStringToDate(dateOut);
		return (((dateStop.getTime() - dateStart.getTime())/(24*60*60*1000))*accommodation.getPrice());		
	}
}
