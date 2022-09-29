/** Lab QUE3: WAP to accept a no from user and check it is prime or not. Pass this number 
 in different function and check it is even or odd. IF number is even than check it is divisible
 by 10 or not in different function and is no is odd than check it is divisible by 3 or not in different function
   */

import java.util.*;				//import all packages
public class Labq3				//main class
{
	//declare the variables
	static int num;
	int i;
	int count=0;

	public static void main(String[] args)		//main class
	{
		Labq3 obj=new Labq3();	//create object of the main class to call function
		//call the function using object of the main class
		obj.Prime();
		obj.even_odd(num);	
		obj.div_ten(num);
		obj.div_three(num);
		
	}
	//prime()function to find number is prime or not
		public void Prime()
		{
	      Scanner s = new Scanner(System.in);		//allows user to take input from console
	      
	      System.out.print("Enter a Number: ");		//enter user choice number
	      num = s.nextInt();						// to scan the next word of the input as an int
	      
	      for(i=2; i<num; i++)						
	      {
	         if(num%i == 0)							
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	      {
	         System.out.println("\nIt is a Prime Number.");
	      }
	      else
	      {
	         System.out.println("\nIt is not a Prime Number.");
	      }
		}
		//even_odd()function to find number is even or odd
		public void even_odd(int num)
		{
			
	        if(num % 2 == 0)
	        {
	            System.out.println(num + " is even");
	        div_ten(num);				//call function div_ten
	        }
	        else
	        {
	            System.out.println(num + " is odd");
	        div_three(num);				//call function div_ten
	        
	        }
		}
		
		public void div_ten(int num)
		{
			if(num%10==0)					//num   divisible by 10
			{
				System.out.println(num+" number is divisible by 10");
			}
			
			
		}
		public void div_three(int num)
		{
			if(num%3==0)					////num   divisiable by 3
			{
				System.out.println(num+" number is divisible by 3");
			}
			
			
		}
}
