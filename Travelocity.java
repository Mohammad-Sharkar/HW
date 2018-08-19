package oop;//abstraction and inheritance

public class Travelocity extends Expidea implements TravelAgency{

	public void AirTicketing() {
		System.out.println("Only Domestic flight tickets");
			
	}

	public void HotelRoomBooking() {
		System.out.println("Hotel Rooms can be booked from North Ameria only");
		
	}

	public void CarRental() {
		System.out.println("Car rental available in North America");
		
	}

}
