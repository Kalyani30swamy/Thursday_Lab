package Inheritance;			//Package created to group the class and interface

import java.util.*;				//import packages
public class Q2_SOD extends Q2_reverseno 		//Extend the class Q2_reverse with the class Q2_SOD
{
	public static void sod() 				//Method of second class for sum of digit
	{
		int num,digit,sum=0;  					//Initialize  variables 
		Scanner sc = new Scanner(System.in); 	//allows user to take input from console 
		System.out.print("Enter the number: "); //print or take number from user 
		num = sc.nextInt();  					//to scan the next word of the input as an int
		while(num>0)  
		{ 
		digit = num%10;  			//finds the last digit of the given number  		  
		sum = sum + digit;  		//adds last digit to the variable sum		 
		num=num/10;  				//removes the last digit from the number 
		}  		  
		System.out.println("Sum of Digits: "+sum); 	//prints the result
	}
	
}
