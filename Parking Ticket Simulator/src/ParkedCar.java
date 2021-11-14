
public class ParkedCar 
{
	/*FIELDS*/
	private String make;
	private String model;
	private String color;
	private String License;
	private int minutesParked;
	
	
	/*CONSTRUCTOR*/
	public ParkedCar()
	{
		this.make = " no make";
		this.model = " no model ";
		this.color = " no color ";
		this.License = " no license ";
		this.minutesParked = 0;
	}
	
	public ParkedCar(String make, String model, String color, String License, int min)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.License = License;
		this.minutesParked = min;
	}
	
	public ParkedCar(ParkedCar obj2)
	{
		this.make = obj2.make;
		this.model = obj2.model;
		this.color = obj2.color;
		this.License = obj2.License;
		this.minutesParked = obj2.minutesParked;
	}
	
	/*ACCESOR*/
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getLicense()
	{
		return License;
	}
	
	public int getMinutesParked()
	{
		return this.minutesParked;
	}

	public String toString()
	{
		return ("Make: " + getMake() + "\nModel: " + getModel() + "\nColor: " + getColor() + "\nLicense: " + getLicense() + "\nMinutes parked: " + getMinutesParked());
	}
	
	public void setMake(String Make)
	{
		this.make = Make;
	}
	
	public void setModel(String Model)
	{
		this.model = Model;
	}
	
	public void setColor(String Color)
	{
		this.color = Color;
	}
	
	public void setLicense (String License)
	{
		this.License = License;
	}
	
	public void setMinutesParked(int min)
	{
		this.minutesParked = min;
	}
	
}
