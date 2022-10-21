package inherit;

import java.util.Scanner;

public class Accept_empdetail extends Highest_salary 
{
	static int emp_no;
	int total_exp=0;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Employee Number");
		emp_no=sc.nextInt();
		Accept_empdetail emp[]=new Accept_empdetail[emp_no];
		//For loop to accept n Number of array of object for n employees
		for(int i=0;i<emp_no;i++) 
		{
			emp[i]=Accept_empdetail();
			emp[i].accept_details();
		}
		//taking max salary as 1st employee
		max_sal=emp[0].getSalary();
		for(int i=1;i<emp_no;i++) {
			//checking if max salary is greater than every other employee's salary
			if(emp[i].getSalary()>max_sal)
			{
				max_sal=emp[i].getSalary();
			}
		}
		for(int i=0;i<emp_no;i++) {
			//if salary of employee matches the max salary then print that employee's details
			if(emp[i].getSalary()==max_sal)
			{
				System.out.println("Employee details with highest salary:");
				emp[i].display_details();
			}
		}
	}

	public void accept_details() {
    	char ch;
    	System.out.println("Enter Employee's name : ");
    	name=sc.next();
    	System.out.println("Enter Employee's Id : ");
    	e_id=sc.nextInt();
    	System.out.println("Enter Employee's Phone no : ");
    	phone_no=sc.nextLong();
    	System.out.println("Enter Employee's address : ");
    	address=sc.next();
    	System.out.println("Enter Employee's salary : ");
    	salary=sc.nextInt();
    	setSalary(salary);
    	System.out.println("Enter your expenses: ");
    	do {	
    		System.out.println("Enter Expense Reason : ");
    		String reason=sc.next();
    		System.out.println("Enter Expenses :");
    		exp=sc.nextInt();
    		total_exp=total_exp + exp;
    		System.out.println("Add More Expenses? y/n");
    		ch=sc.next().charAt(0);
    	}while(ch=='y'|| ch=='Y');
    }
    
    public void display_details() {
    	System.out.println("Employee's name : "+name);
    	System.out.println("Employee's ID : "+e_id);
    	System.out.println("Employee's Phone No. : "+phone_no);
    	System.out.println("Employee's Address : "+address);
    	System.out.println("Employee's Salary : "+salary);
    	System.out.println("Total Expenses of "+name+" are "+total_exp);
    	System.out.println("Remaining Salary of Employee after Expenses "+(salary-total_exp));
    }
}