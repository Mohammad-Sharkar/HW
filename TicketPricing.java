package oop; //polymorphism Method OvrLoading

public class TicketPricing extends Travelers{
	
	public int PriceOfTickets(int ticket, int tax) {
		int total = ticket + tax;
		return total;
	}
	public int PriceOfTickets(String ticket, int tax) {
		int total = tax;
		return total;
	}
		
	public int PriceOfTickets(int ticket, int tax, int booking) {
		int total = ticket + tax + booking;
		return total;
	}
	public int PriceOfTickets(int ticket, int tax, int booking, int baggage) {
		int total = ticket + tax + booking + baggage;
		return total;
	}
	public int PriceOfTickets(int ticket, int tax, int booking, int baggage, int food) { //method OverLoading
		int total = ticket + tax + booking + baggage + food;
		return total;
	}
	
}

