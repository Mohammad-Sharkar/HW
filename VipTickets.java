package oop; //Polymorphism method OverRiding

public class VipTickets extends TicketPricing{
	
	public int PriceOfTickets(int ticket, int tax, int booking, int baggage) {
		int total = ticket + tax + booking + baggage + 30; //Method overriding
		return total;
	}

}
