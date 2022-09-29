// Lab QUE1: Write a program to accept a number from user and then prints the sum of the even and odd integers.

import java.util.Scanner;					//import packages
public class Evenuodd_add 					//main class
{
    public static void main(String[] args) 	//main method
    {
        int size,sumE= 0,sumO=0;				//declare the variables
        char ans;	
        Scanner sc = new Scanner(System.in);	//allows user to take input from console
        do
        {
        System.out.print("Enter the number of elements in array:");	//Enter the numbers
        size = sc.nextInt();											// to scan the next word of the input as an int
        int[] a = new int[size];										//initialize an array object named size and has a given number of elements
        System.out.println("Enter the elements of the array:");		//enter all the elements you want in that array
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();									// to scan the next word of the input as an int
        }
        for(int i=0;i<size;i++)
        {														// begin from the first element and check if it is odd or even
            if(a[i]%2 == 0)
            {
                sumE = sumE+a[i];							//checking the number is even and adding the all even numbers
                
            }
            else
            {
                sumO =sumO+a[i];							//checking the number is odd and adding the all odd numbers
               
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);		//displaying addition of the even numbers
        System.out.println("Sum of Odd Numbers:"+sumO);			//displaying addition of the odd numbers
        System.out.println("Do you want to continue y/n");
		   ans=sc.next().charAt(0);			//next() function returns the next word in input as string and charAt(0) function returns the first character in that string.
    }
      //if wants to continue print y
        while(ans=='Y'||ans=='y');
        System.out.println("Thanku");
		  
        
    }
}
