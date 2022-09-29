/*WAP to accept no from user in array and find out average and sum of array numbers.*/

import java.util.Scanner;			//import packages
public class Labq5 					//main class
{
	    public static void main(String[] args) 	//main method
	    {
	        int n, sum = 0;						//declare variables
	        float average;
	        Scanner s = new Scanner(System.in);	//allows user to take input from console
	        System.out.print("Enter numbers you want in array:");	//enter user choice array
	        n = s.nextInt();										// to scan the next word of the input as an int
	        int a[] = new int[n];
	        System.out.println("Enter all the numbers:");		//enter user choices numbers
	        //for loop we calculate sum of elements of array
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum:"+sum);			//print sum of all numbers prsent in array
	        average = (float)sum / n;				//divide sum by number of numbers in array to get average
	        System.out.println("Average:"+average);	////print average
	    }
}
