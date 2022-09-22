//Q1.Write a program to accept a number from the user and check if a given number is palindrome or not
// Main Driver function
import java.util.*;								//import packages
public class Palindrome 						//main class	
{
public static void main(String args[])			//main method
{
	//take input from the use
	 Scanner sc = new Scanner(System.in);		//allows user to take input from console
	 System.out.println("Enter a number:"); 	//print the user choice number
	 int num=sc.nextInt();						// to scan the next word of the input as an int
	 int rev_num=0,rem;							//initialize the variables
	 int original_num=num;						//store the number to original_num
	  
	 //get the reverse of original_num
	 //store it in the variable
	 while(num>0)								//to reverse num and store the reversed number in rev_num
	 {
		 rem=num%10;				
		 rev_num = (rev_num*10)+rem;
		 num =num/10;		
	 }
	 //check if rev_num and original_num are equal
	 if(original_num==rev_num)
	 {
		 System.out.println("Number is Palindrome"); //if rev_num is same as original_num print it as palindrome
	 }
	 else
	 {
		 System.out.println("Number is not Palidrome");////if rev_num is not same as original_num print it as not palindrome
	 }
	
}
}

