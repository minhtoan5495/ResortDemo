package demo;

import java.util.ArrayList;
import java.util.List;

public class House extends Accommodation {
	private String name;
	private List<Bed> listbed = new ArrayList<>();
	private List<Room> listroom = new ArrayList<>();
	public House() {
		super();
	}
	public House(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addBed(Bed bed){
		listbed.add(bed);
	}
	public void addRoom(Room room){
		listroom.add(room);
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public float getPrice() {
		return Constant.PRICE_HOUSE;
	}
}
