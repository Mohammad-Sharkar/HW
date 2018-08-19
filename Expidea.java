package oop;//abstraction

public class Expidea extends SpaceEx implements TravelAgency, NorthPoleTour {

	
	public void AirTicketing() {
		System.out.println("International and Domestic flight tickets");
			
	}
	public void HotelRoomBooking() {
		System.out.println("Hotel Rooms can be booked from all over the world");	
		
	}
	public void CarRental() {
		System.out.println("Car rental available from North Ameria and Europe");
		
	}
	public void InterPlanetaryTravel() {
		System.out.println("Space travel between Earth and Mars");
		
		
	}
	public void AuroraViewing() {
		System.out.println("Experience some of the Best view of Northern Lights");
		
	}

}
