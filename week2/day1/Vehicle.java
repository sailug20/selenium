package august2.week2.day1;

public class Vehicle {

	public void applyBrake()
	{
	System.out.println("ApplyBrake");
	}
	public void soundHorn()
	{
		System.out.println("Sound Horn");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
           Vehicle vehicle = new Vehicle();

         vehicle.applyBrake();
         vehicle.soundHorn();  
	}

}
