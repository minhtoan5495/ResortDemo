package demo;

import java.util.Scanner;

import demo.Accommodation;
import demo.House;
import demo.Villas;

public class Quanly {
	private static Scanner in;

	public static void main (String args []){
		ResortManagement<Accommodation> listAcc = new ResortManagement<Accommodation>();
		ResortManagement<Customer> listCus = new ResortManagement<Customer>();
		Accommodation villa = new Villas();
		villa.setName("Villa");
		Accommodation house = new House();
		house.setName("House");
		listAcc.addRS(house);
		listAcc.addRS(villa);
		in = new Scanner(System.in);
		int chon;
		do {
		System.out.println("1. Tạo mới");		
		System.out.println("2. Xem");
		System.out.println("3. Thoát");
		System.out.println("____________________________");
		System.out.print("Mời chọn : ");
		chon = in.nextInt();
		switch (chon) {
			case 1:
				Customer cus = new Customer();
				Scanner input = new Scanner(System.in); 
				String name,dateIn,dateOut,loaiAcc;
				System.out.println("Tên : ");
				name = input.nextLine();
				cus.setName(name);
				System.out.println("Ngày đặt : ");
				dateIn = input.nextLine();
				cus.setDateIn(dateIn);
				System.out.println("Ngày trả : ");
				dateOut = input.nextLine();
				cus.setDateOut(dateOut);
				System.out.println("Loại Accommodation thuê : ");
				loaiAcc = input.nextLine();
				if(loaiAcc.equals("villa")){
					cus.setAccommodation(villa);
				}
				if(loaiAcc.equals("house")){
					cus.setAccommodation(house);
				}
				listCus.addRS(cus);
				break;
			case 2:
				listCus.checkOut();
				break;
			case 3:
				System.out.println("Đã thoát");
				System.exit(0);
		}
		} while (chon != 0);
	}
}
