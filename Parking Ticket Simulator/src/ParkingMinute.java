
public class ParkingMinute 
{
	private ParkedCar car;
	private int minutesPurchased;
	private double Fine;
	
	public ParkingMinute()
	{
		car = new ParkedCar();
		minutesPurchased = 0;
		this.Fine = 0;
		
	}
	
	public ParkingMinute(ParkedCar c, int min)
	{
		car = new ParkedCar(c);
		this.minutesPurchased = min;
		this.Fine = getFine();
	}
	
	public ParkingMinute(ParkingMinute obj2)
	{
		this.car = obj2.car;
		this.minutesPurchased = obj2.minutesPurchased;
		this.Fine = obj2.Fine;
	}
	
	public ParkedCar getCar()
	{
		return car;
	}
	
	public int getMinutesPurchased()
	{
		return minutesPurchased;
	}
	
	public double getFine()
	{
		Fine = car.getMinutesParked() - this.getMinutesPurchased();
		
		if (Fine > 0)
		{
			return Fine;
		}
		else 
		{
			return Fine = 0;
		}
	}
	
	public String toString()
	{
		return (car.toString() + "\n Minutes Purchased: " + this.getMinutesPurchased() + "\nFine: " + this.getFine() );
	}
}
