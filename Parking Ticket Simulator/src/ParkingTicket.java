
public class ParkingTicket 
{
	private ParkedCar carDetails;
	private ParkingMeter meter;
	private PoliceOfficer Police;
	private double fine;
	
	public ParkingTicket()
	{
		this.carDetails = new ParkedCar();
		this.meter = new ParkingMeter();
	}
	
	public ParkingTicket(ParkedCar c, ParkingMeter f, PoliceOfficer p)
	{
		this.carDetails = new ParkedCar(c);
		this.meter = new ParkingMeter(f);
		this.Police = new PoliceOfficer(p);
	}
	
	public ParkingTicket(ParkingTicket obj2)
	{
		this.carDetails = obj2.carDetails;
		this.meter = obj2.meter;
		this.Police = obj2.Police;
	}
	
	public ParkedCar getCarDetails()
	{
		return this.carDetails;
	}
	
	public ParkingMeter getFine()
	{
		return meter;
	}
	
	public PoliceOfficer getPolice()
	{
		return Police;
	}
	
	public void setFine(double fine)
	{
		this.fine = fine;
	}
	
	public void setCar(ParkedCar car)
	{
		this.carDetails = car;
	}

	public void setPolice(PoliceOfficer cop)
	{
		this.Police = cop;
	}
	
	public void setParkingMeter(ParkingMeter m)
	{
		this.meter = new ParkingMeter(m);
	}
	
	public String toString()
	{
		return (carDetails + "\nThe Fine is" + getFine() + "\nPolice Details: " + Police.toString());
	}
	
}
