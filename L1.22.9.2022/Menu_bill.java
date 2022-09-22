//Q3.WAP to Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered

import java.util.*; 								//import packages
public class Menu_bill 								//main class
{

	public static void main(String[] args)			//Main method
	{
		// TODO Auto-generated method stub
		//declare variables
		int menu_item,menu1,i_price=0,q=0;
		  char ans;		  
		  String i_name="";							//adding order list to string i_name
		  Scanner sc=new Scanner(System.in);		//allows user to take input from console
		  //using do while loop
		  do
		  {
		   System.out.println("Menu:\n1:Starters \n2:Main course \n3:Desserts");
		   menu_item=sc.nextInt();					// to scan the next word of the input as an int
		   //using switch case to get main choice
		   switch(menu_item)
		   {
		   case 1:
			   System.out.println("1:Order your starter");
				System.out.println("1:Masala Papad\t\t20");
				System.out.println("2:Spring Rolls\t\t30");
				System.out.println("3:Caesar Salad\t\t50");
		    menu1=sc.nextInt();						// to scan the next word of the input as an int
		    System.out.println("Enter quantity");
			q=sc.nextInt();							// to scan the next word of the input as an int
		    //using switch case to get sub choice
		    switch(menu1)
		    {
		    case 1:
		    	i_price+=20*q;						//multiplying the rate with the quantity that user selects				
				i_name+="\nMasala Papad";
				break;
				
			case 2:
				i_price+=30*q;						//multiplying the rate with the quantity that user selects
				i_name+="\nSpring Rolls";
				break;
				
			case 3:
				i_price+=50*q;						//multiplying the rate with the quantity that user selects
				i_name+="\nCaesar Salad";
		     break;
		    default:
		     System.out.println("Invalid choice");	//when user puts invalid number 
		      
		    }
		    break;
		   case 2:
			   System.out.println("2:Order your Main course");
				System.out.println("1:Grilled salmon with dill sauce\t \t 189");
				System.out.println("2:Chicken and mushroom pie		\t 200");
				System.out.println("3:Marrakesh Vegetarian curry      \t\t176");
		    menu1=sc.nextInt();						// to scan the next word of the input as an int
		    System.out.println("Enter quantity");
			q=sc.nextInt();							// to scan the next word of the input as an int
		    //using switch case to get sub choice
		    switch(menu1)
		    {
		    case 1:
		    	i_price+=189*q;						//multiplying the rate with the quantity that user selects		
				i_name+="\nGrilled salmon with dill sauce";
				break;
				
			case 2:
				i_price+=200*q;						//multiplying the rate with the quantity that user selects					
				i_name+="\nChicken and mushroom pie";
				break;
				
			case 3:
				i_price+=176*q;						//multiplying the rate with the quantity that user selects				
				i_name+="\nMarrakesh Vegetarian curry";
		     break;
		    default:
		     System.out.println("Invalid choice");
		      
		    }
		    break;
		   case 3:
			   System.out.println("3:Order your Deserts");
				System.out.println("1:Apple pie with cream\t\t59");
				System.out.println("2:Fruit salad          \t\t67");
				System.out.println("3:Vanilla ice cream     \t32.");
		    menu1=sc.nextInt();						// to scan the next word of the input as an int
		    System.out.println("Enter quantity");
			q=sc.nextInt();							// to scan the next word of the input as an int
		    //using switch case to get sub choice
		    switch(menu1)
		    {
		    case 1:
		    	i_price+=59*q;						//multiplying the rate with the quantity that user selects				
				i_name+="\nApple pie with cream";
				break;
				
			case 2:
				i_price+=67*q;						//multiplying the rate with the quantity that user selects		
				i_name+="\nFruit salad";
				break;
				
			case 3:
				i_price+=32*q;						//multiplying the rate with the quantity that user selects				
				i_name+="\nVanilla ice cream";
		     break;
		    default:
		     System.out.println("Invalid choice");
		      
		    }
		    break;
		   
		   }
		   System.out.println("Do you want to order another dish y/n");
		   ans=sc.next().charAt(0);					//next() function returns the next word in input as string and charAt(0) function returns the first character in that string.
		  }
		  while(ans=='Y'||ans=='y');
		  System.out.println("Thanks for coming");
		  System.out.println("The Food Items ARE:\n"+i_name); //Prints the food item which user has ordered
		  System.out.println("The Total bill amount is:"+i_price);//prints the total bill
	}

}