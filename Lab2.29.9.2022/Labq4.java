/*WAP to accept size from user accordingly accept numbers from user and also 
 * accept the no from user which you want to delete from your array and display the output.*/

import java.util.Scanner;				//Import packages

public class Labq4						//main class
{
   public static void main(String[] args)	//main method
   {
	   int i, j,element,n;					//declare variables
	    
	      Scanner size = new Scanner(System.in);	//allows user to take input from console
	      
	      System.out.print("Enter numbers you want in array:");		//enter user choice array
	        n = size.nextInt();									// to scan the next word of the input as an int
	        int a[] = new int[n];
		   
		   System.out.println("Enter all the numbers:");			//enter user number
		   for (i = 0; i < n; i++) 
		   	{
			   a[i] = size.nextInt();
		   	}
		   //enter user choice number which user wants to remove
		   	System.out.print("Enter the number to Remove: ");
		   	element = size.nextInt();
      
		   	for(i=0; i<n; i++)
		   	{
		   		if(element==a[i])
		   		{
		   			for(j=i; j<(n-1); j++)
		   			{
		   			a[j] = a[j+1];
		   			System.out.println("\n The number removed successfully!");
		   			}
		   			
         }
      }
      //Displays the updated array list number
      System.out.println("\nThe new array is: ");
      for(i=0; i<(n-1); i++)
         System.out.print(a[i]+ " ");
   }
}