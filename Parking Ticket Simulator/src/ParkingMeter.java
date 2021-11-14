
public class ParkingMeter
{
	private ParkedCar car;
	private int minutesPurchased;
	private double minutesExceeded;

	
	public ParkingMeter()
	{
		car = new ParkedCar();
		minutesPurchased = 0;
		this.minutesExceeded = 0;
		
	}
	
	public ParkingMeter(ParkedCar c, int min)
	{
		car = new ParkedCar(c);
		this.minutesPurchased = min;
		this.minutesExceeded = getMinutesExceeded();
	}
	
	public ParkingMeter(ParkingMeter obj2)
	{
		this.car = obj2.car;
		this.minutesPurchased = obj2.minutesPurchased;
		this.minutesExceeded = obj2.minutesExceeded;
	}
	
	public ParkedCar getCar()
	{
		return car;
	}
	
	public int getMinutesPurchased()
	{
		return minutesPurchased;
	}
	
	public double getMinutesExceeded()
	{
		minutesExceeded = car.getMinutesParked() - this.getMinutesPurchased();
		
		if (minutesExceeded > 0)
		{
			return minutesExceeded;
		}
		else 
		{
			return minutesExceeded = 0;
		}
	}
	
	public void setMinutesPurchased(int minutes)
	{
		this.minutesPurchased = minutes;
	}
	
	public String toString()
	{
		return (car.toString() + "\n Minutes Purchased: " + this.getMinutesPurchased() + "\nMinutes Exceeded: " + this.getMinutesExceeded() );
	}
}
