
public class PoliceOfficer 
{
	private String name;
	private String Badge; //xxx000
	private boolean expired;

	
	public PoliceOfficer()
	{
		name = "";
		Badge = "";
	}
	
	public PoliceOfficer(String name, String Badge)
	{
		this.name = name;
		this.Badge = Badge;
	}
	
	public PoliceOfficer(PoliceOfficer p)
	{
		this.name = p.name;
		this.Badge = p.Badge;
	}
	
	
	
	public String getName()
	{
		return name;
	}
	
	public String getBadge()
	{
		return Badge;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBadge(String Badge)
	{
		this.Badge = Badge;
	}
	
	//determine if expired
	public boolean isExpired(ParkedCar car, ParkingMeter minutes)
	{
		if (car.getMinutesParked() > minutes.getMinutesPurchased() )
		{
			expired = true;
			
		}
		else
			expired = false;
		
		return expired;
	}
	
	//tostring
	public String toString()
	{
		return ("\nPolice name: " + this.getName() +
		"\nPolice badge: " + this.getBadge());
	}
	
	//how to generate a ticket?
	public ParkingTicket generateTicket(ParkedCar car, ParkingMeter minutes)
	{
		ParkingTicket ticket = new ParkingTicket(car, minutes, this);
		int remainingMinutes = car.getMinutesParked() - minutes.getMinutesPurchased();
		
		if (isExpired(car, minutes) == true)
		{
			if (remainingMinutes <= 60)
			{
				ticket.setFine(25);
			}
			else 
			{
				double newFine = 25 + (10 * (remainingMinutes / 60));
				ticket.setFine(newFine);
			}
			
		}
		return ticket;
	}
}
