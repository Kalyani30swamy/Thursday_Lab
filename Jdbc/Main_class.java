package Jdbc;
import java.util.Scanner;

public class Main_class 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	//	Create_class obj= new Create_class();
	//	obj.Create_table();
		Selectdata_class obj11= new Selectdata_class();
		Insert_class obj1= new Insert_class();
		Update_class obj2= new Update_class();
		Delete_class obj3= new Delete_class();
	
		System.out.println("... Hello Welcome ...");
		int ch;
		char ans;		 
		Scanner sc=new Scanner(System.in);			
	
		do 
		{
			System.out.println("Please select one option....");
			System.out.println("\n 1: Select \n 2: Insert \n 3: Update \n 4: Delete ");  
			
			ch = sc.nextInt();					
			
			switch(ch)				
			{
				case 1:
					obj11.selectData();
					break;
			
				case 2:
					obj1.insertData();
					break;
		
				case 3:
					obj2.updateData();
					break;
		
				case 4:
					obj3.deleteData();
					break;
	
				default:
			System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue y/n"); 		
		    ans=sc.next().charAt(0);	
		}
		while(ans=='Y'||ans=='y');
	}

}