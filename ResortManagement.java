package demo;

import java.util.ArrayList;
import java.util.List;

public class ResortManagement<E> {
	private List<E> resources = new ArrayList<E>();
	public void addRS(E x) {
		resources.add(x);
	}
	
	public void removeRS(E x){
		resources.remove(x);
	}
																																																																																															
	public E retrieveLast() {
		int size = resources.size();
		while (size > 0) {
			return resources.get(size-1);
			
		}
		return null;
	}
	public void checkOut(){
		for(E e : resources){
			if(e instanceof Villas){
				Villas v = (Villas) e;
				System.out.println(v.getName());
			}
			if(e instanceof House){
				House h = (House) e;
				System.out.println(h.getName());
			}
			if(e instanceof Customer){
				Customer c = (Customer) e;
				System.out.println("Tên Cus : " + c.getName() + 
						"\n Ngày đặt : " + c.getDateIn() + 
						"\n Ngày trả : " + c.getDateOut() + 
						"\n Loại Accommodation : " + c.getAccommodation() +
						"\n Thanh toán : " + c.checkOut() + " USD");
			}
		}
	}
}
