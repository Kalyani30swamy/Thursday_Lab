/*WAP to create a class Reverse No, second class SOD , 
 * Third class use both the class property and display the output*/
package Inheritance;			//Package created to group the class and interface

import java.util.*;				//import packages

public class Q2_reverseno
{
	public static void reverse()		//method of first class
	{
		int num=0,reverse=0; 		//Initialize  variables 	
		Scanner sc=new Scanner(System.in);		//allows user to take input from console
		System.out.println("Enter the number= ");	//print or take number from user
		num=sc.nextInt();						//to scan the next word of the input as an int
		while(num != 0)   
		{  
			int remainder=num%10;			//find the remainder of the given number by using the modulo % operator  
			reverse=reverse*10+remainder; //Multiply the variable reverse by 10 and add the remainder into it 
			num=num/10;  					//Divide the number by 10
		}  
		System.out.println("The reverse of the given number is: "+reverse);  //Print the reverse number
	}
}