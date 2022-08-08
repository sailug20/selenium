package august2.week2.day1;

public class ArmstrongNumber {

	   
	public static void main(String[] args) {
		
		isArmstrongNumber(153);
	}
	
		// TODO Auto-generated method stub
		//eg;153,   1*1*1 + 5*5*5 + 3*3*3 =  153(Armstrong number)
		
	public static void isArmstrongNumber(int num)
	{	
     
		
      int cube=0;	
      int r;
      int t;
		
		t= num; 
		//x is any given number
		while (num>0)
		{
			r = num%10;
			//here% is called mod where we take the reminder as r i.e 3//
			num = num/10; // here we take the quotient i.e 15 as num//
			cube = cube + (r*r*r);
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


