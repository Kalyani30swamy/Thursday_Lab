// Lab QUE2:Write a program to calculate HCF of Two given number.

import java.util.Scanner;			//import packages
public class HCF_program 			//main class
{
	   public static void main(String args[])	//main method
	   {
		   int num1, num2, hcf=0;				//declare the variables
	      Scanner sc = new Scanner(System.in);	//allows user to take input from console
	      System.out.println("Enter first number :: ");		//print num1
	      num1 = sc.nextInt();								// to scan the next word of the input as an int
	      System.out.println("Enter second number :: ");	//print num2	
	      num2 = sc.nextInt();

	      for (int i = 1; i <= num1 || i <= num2; i++)	//run thee loop in the iteration of (i) thats is between the [1,min(num1,num2)]	
	        {
	       if (num1 % i == 0 && num2 % i == 0)	//if i satisfy the condition given then new value of HCF becomes the i
	          hcf = i;
	        }

	      System.out.println("The HCF: "+ hcf);		//print the value of HCF
	   }
}

