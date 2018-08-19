package oop;

public class TestAll {

	public static void main(String[] args) {
		
		
		
		TravelAgency ta = new Expidea();
		ta.AirTicketing();
		ta.HotelRoomBooking();
		ta.CarRental();
		
		Expidea ex = new Expidea();
		ex.AuroraViewing();
		ex.InterPlanetaryTravel();
		
		Travelocity tr =  new Travelocity();
		tr.AirTicketing();
		tr.HotelRoomBooking();
		tr.CarRental();
		
		//Expidea exp = new Travelocity();
		
		Kayak ka = new Kayak();
		//Expidea ek = new Expidea();
		ka.AirTicketing();
		ka.HotelRoomBooking();
		ka.CarRental();
		
		
		//Encapsulation
		
		Travelers trv1 = new Travelers();
		trv1.setTraName("Shams Muhammad");
		trv1.setTraAddress("New York");
		trv1.setTraAge(35);
		trv1.setTraPassportNo("P1234567");
		
		System.out.println(trv1.getTraName()+" "+trv1.getTraAddress()+" "+trv1.getTraAge()+" "+trv1.getTraPassportNo());
		
		
		//Polymorphism
		
		TicketPricing tkt = new TicketPricing();
		System.out.println(tkt.PriceOfTickets(1000, 90));
		System.out.println(tkt.PriceOfTickets(1000, 90, 10));
		System.out.println(tkt.PriceOfTickets(1000, 90, 10, 20));
		
		VipTickets vip = new VipTickets();
		System.out.println(vip.PriceOfTickets(1000, 90, 10, 20));
		
		
		
		
		
		
		
		

	}

}
