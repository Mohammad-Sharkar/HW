package oop;//abstraction & inheritance

public class BookingDotCom extends Travelocity implements TravelAgency{

	
	public void AirTicketing() {
		System.out.println("Cheapest air ticket");
		
	}
	public void HotelRoomBooking() {
		System.out.println("Discount hotel room");
		
	}
	public void CarRental() {
		System.out.println("Hybrid car available");
		
	}

}
