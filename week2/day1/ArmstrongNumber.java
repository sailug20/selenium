package august2.week2.day1;

public class ArmstrongNumber {
  
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//eg;153,   1*1*1 + 5*5*5 + 3*3*3 =  153(Armstrong number)
		armstrongnumber(int x);
	}	
	public static void armstrong(int x)
	{	
     
		
      int n,	
      int r;
      int t;
		
		t= x; 
		//x is any given number
		while (x>0)
		{
			r = x%10;
			x = x/10;
			n = n+ (r*r*r);
		}
		if (t==cube)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
		{
			System.out.println("This is not an Armstrong number");
			}
 
	
	}
	
	
}
				
	      
	


