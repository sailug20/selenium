package august2.week2.day1;

public class MyHome
{

	private String bed="queen";
	
	public void bedroom()
	{
	 System.out.println(bed);
	
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        
	PublicPark park = new PublicPark();
           
           MyHome house = new MyHome();
           
           house.bedroom();
	       park.playground();
	       park.swing();
            System.out.println("playground");
            
            System.out.println("swing");
	}

}
