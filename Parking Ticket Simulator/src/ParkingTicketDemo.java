
public class ParkingTicketDemo 
{
	public static void main(String[] args)
	{
		//establisehs the parked car 
		ParkedCar car = new ParkedCar();
		
		car.setMake("Buick");
		car.setModel("Le Sabre");
		car.setColor("gold");
		car.setLicense("SAS5532");
		car.setMinutesParked(138);
		
		//establishes the parking meter
		ParkingMeter meter = new ParkingMeter();
		meter.setMinutesPurchased(20); 
		
		//establishes the officer on the scene
		PoliceOfficer officer = new PoliceOfficer();
		officer.setName("Nate Lahet");
		officer.setBadge("THX672"); 
		
		//the interaction bw officer and parked car
		if (officer.isExpired(car, meter))
		{
			ParkingTicket ticket = officer.generateTicket(car, meter);
			System.out.println("Ticket generated:");
			System.out.println(ticket);
		}
		else
		{
			System.out.println("no ticket needed");
		}
		
	}
}
