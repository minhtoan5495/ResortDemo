package demo;

import java.util.ArrayList;
import java.util.List;

public class Villas extends Accommodation {
	private String name;
	private List<Bed> listbed = new ArrayList<>();
	private List<Room> listroom = new ArrayList<>();
	public Villas() {
		super();
	}
	public Villas(String name, List<Bed> listbed) {
		super();
		this.name = name;
		this.listbed = listbed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Bed> getListbed() {
		return listbed;
	}
	public void setListbed(List<Bed> listbed) {
		this.listbed = listbed;
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
		return Constant.PRICE_VILLA;
	}
}

