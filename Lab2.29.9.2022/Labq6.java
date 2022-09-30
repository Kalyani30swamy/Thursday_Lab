

/*Lab QUE6 : WAP to display prime no between 1 to 150 in two dimension array*/
import java.util.Scanner;						//import packages
public class Labq6 								//main class
{

	public static void main(String[] args)		//main method 
	{
		
		Scanner sc = new Scanner(System.in);		//allows user to take input from console
        
        int num1,num2,i,j,flag;				// Declare the variables
 
        
        System.out.printf("Enter starting Number : ");		//enter starting number from user
        num1=sc.nextInt(); 									// to scan the next word of the input as an int
 
        System.out.printf("\nEnter Ending Number : ");	//enter ending number from user 
        num2=sc.nextInt(); 									// to scan the next word of the input as an int
 
        
        System.out.printf("Prime numbers between " +num1+ " and " +num2+ " are: ", num1, num2);	// Print display message
 
        
        for (i=num1;i<=num2;i++) 					// Traverse each number with the help of for loop
        {   											
            if (i==1 || i==0)					//  0 and 1 as they are neither prime nor not prime
                continue;							
 
            
            flag = 1;								 //flag variable to tell if i is prime or not
 
            for (j=2;j<=i/2;++j) 
            {
                if (i%j == 0)
                {
                    flag=0;
                    break;
                }
            }
           
            if (flag==1)						// flag = 1 means prime and flag = 0 means is not prime
                System.out.println(i);
        }
    }
}