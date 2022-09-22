//Q2.WAP to accept choice from user and perform the operation:
//1: factorial
//2:sum of digit
//3:Armstrong number or not
//4:fibonacci series
//5:Prime no or Not
import java.util.*;									//import packages
public class Operation_demo							//main class
{
	public static void main(String[] args) 			//main method
	{
		// declare variables
		int ch;
		char ans;
		Scanner scc=new Scanner(System.in);		//allows user to take input from console
		//enter the user choices
		do
		{
		System.out.println("Enter Your Choice\n 1:factorial\n 2:sum of digit \n 3:armstrong number or not\n 4:fibonacci series \n 5:prime or not");
	     Scanner in=new Scanner(System.in); 			//allows user to take input from console
	       ch=in.nextInt();								// to scan the next word of the input as an int
	//start of Switch case
      switch(ch)
      {
       case 1:
    	   System.out.println("\nfactorial");
    	   fact();				// called method
    	   break;
       case 2:
    	   System.out.println("\nsum of digit");
    	   sum();				// called method
    	   break;				
       case 3:
    	   System.out.println("\narmstrong number or not");
    	   arms_strong();		// called method
    	   
    	   break;
       case 4:
    	   System.out.println("\nfibonacci series");
    	   fib();				//called method
    	   break;
       case 5:
    	   System.out.println("\nprime or not");
    	   Prime();				// called method
    	   break;
    	   default:
    		   System.out.println("invalid choice");//if user puts the invalid choice
    	   break;
	}
      System.out.println("do you want to continue");//if user want to put more choices
		
		ans=scc.next().charAt(0);	//next() function returns the next word in input as string and charAt(0) function returns the first character in that string.
	
	}
		while(ans=='Y'||ans=='y');

		System.out.println("thanks");//end of choices i.e switch case
		
	}
	
	public static void fact()			// creating user defined method
	{
		int i,fact=1;				//declaring variables  
		int n;						//It is the number to calculate factorial 
	        
	  Scanner scan2 = new Scanner(System.in);  //allows user to take input from console
		System.out.print("Enter the number: ");  
		n= scan2.nextInt();  			// to scan the next word of the input as an int
	  for(i=1;i<=n;i++)					//for loop to iterate the part of program several times
	  {    
	      fact=fact*i; 					   
	  }    
	  System.out.println("Factorial of "+n+" is: "+fact);
	}
	public static void sum()			// creating user defined method
		{
			int number1, digit, summ = 0;  
		Scanner scan1 = new Scanner(System.in); 	//allows user to take input from console
		System.out.print("Enter the number: ");  
		number1 = scan1.nextInt();  				// to scan the next word of the input as an int
		while(number1 > 0)  
		{      
		digit = number1 % 10; 						//finds the last digit of the given number		 
		summ = summ + digit;  						//adds last digit to the variable sum 		  
		number1 = number1 / 10;						//removes the last digit from the number  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+summ);
		}
     public static void arms_strong()				// creating user defined method
     	{
    	 	int num,r,sum=0,og;
    	 	Scanner sc=new Scanner(System.in);		//allows user to take input from console
    	 	System.out.println("Enter the number");
    	 	num=sc.nextInt();						// to scan the next word of the input as an int
    	 	og=num;
    	 	do {
    	 		r=num%10;
    	 		sum=sum+(r*r*r);
    	 		num = num/10;
  	
    	 	}
    	 	while(num>0);
    	 	if(sum==og)
    	 	{
    	 		System.out.println("It is an armsstrong no");
    	 	}
    	 	else
    	 	{
    	 		System.out.println("it is not armsstrong no");
    	 	}
     	}
    public static void fib()							// creating user defined method
    	{					
    		int number,fdg=0,sdg=1,res;
    		Scanner scan=new Scanner(System.in);		//allows user to take input from console
    		System.out.println("Enter the digit of series");
    		number=scan.nextInt();
    		System.out.print(fdg+"\t"+sdg+"\t");
    			while(number-2>0)
    				{
    					res=fdg+sdg;
    					System.out.print(res+"\t");
    					fdg=sdg;
    					sdg=res;
    					number--;
    				}
    	}
    public static void Prime()					// creating user defined method
  		{
    	int i,n;
        boolean isprime= true;
        Scanner scan=new Scanner(System.in);  	//allows user to take input from console
        n=scan.nextInt();						// to scan the next word of the input as an int
        System.out.println("enter the number");

        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if(n < 2)
        {
            isprime = false;
        }
        else
        {
        // running loop till n is wasteful because for any number n the numbers in
        // the range(n/2 + 1, n) won't be divisible anyways.
            for(i=2; i <= n/2; i++)
            {
                if(n % i == 0)
                {
                    isprime = false;
                    break;
                }
            }
        }

        String result = isprime ? "Prime" : "not Prime";
        System.out.println ("The number " + n + " is : " + result);
;
  		}
   
     	

	}
     



