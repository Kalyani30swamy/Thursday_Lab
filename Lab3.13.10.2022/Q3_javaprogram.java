/*"Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50
30 60
"
 */
import java.util.*;		//import packages
public class Q3_javaprogram		//create class
{
	public static void main(String[] args)		//main method
	{
		int rows,cols;							//Initialize  variables 	
		int i,j;								//Initialize  variables 	
		Scanner sc=new Scanner(System.in);		//adding order list to string i_name
		System.out.println("Enter number of rows=");	//print the number of rows
		rows=sc.nextInt();								// to scan the next word of the input as an int
		System.out.println("Enter number of column=");	//print the number of columns
		cols=sc.nextInt();		//to scan the next word of the input as an int
		//declare the 2-d array for rows and columns and also for new array after changing rows and columns
		int array[][]=new int[rows][cols];				
		int transpose[][] = new int[cols][rows];
		//print elements of the array
		System.out.println("Enter the elements of array="); 
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		//to print the original array in rows and columns
		System.out.println("the original array is");
		for(i=0;i<rows;i++)
		{	
			for(j=0;j<cols;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
			
		//transfer one array into another one
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				transpose[j][i]=array[i][j];
			}
		}
		//after changing the rows and columns
		System.out.println("After changing the rows and columns of the array:");
		for(i=0;i<cols;i++)
		{
			for(j=0;j<rows;j++)
			{
				System.out.print(transpose[i][j] + " ");	
			}
			System.out.println();	
	
	}
	}
}
