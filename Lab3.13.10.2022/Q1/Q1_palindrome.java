/*Single:
WAP to create a class which contain the method Palindrom .
the second class will use the proerty of first class and display the output."*/

package Inheritance;			//Package created to group the class and interface

import java.util.*;				//import packages

public class Q1_palindrome 
{
	public static void palidrome()	//method of first class
	{
		int r,sum=0,temp;			//Initialize  variables   
		int num;					//It is the number variable to be checked for palindrome  
		Scanner sc=new Scanner(System.in);		//allows user to take input from console
		System.out.println("Enter the number= ");	//print or take number from user
		num=sc.nextInt();						//to scan the next word of the input as an int
		temp=num;   							//Hold the number in temporary variable 
		//Reverse the number
		while(num>0)							
		{    
			r=num%10;  							//getting remainder  
			sum=(sum*10)+r;    
			num=num/10;    
		}    
		if(temp==sum) 							//If both numbers are same, print "Number is palindrome"
		{
			System.out.println("Number is palindrome ");    
		}
		else  									//Else print "Number is not palindrome "  
		{
			System.out.println("Number is not palindrome");   
		}
	}
}
