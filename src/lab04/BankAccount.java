package lab04;
import java.util.Scanner;

public class BankAccount 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the ATM");
		boolean quit=false;
		
		while(quit==false)
		{
		
		
		System.out.println("Please Select an option");
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdrawal");
		System.out.println("3 - Chech Acount Balance");
		System.out.println("4 - Logout");
		double deposit, withdrawal, howmuch=0.00;
		
		int where = input.nextInt();
		switch(where)
		{
		
		case 1:
			System.out.println("How much do you want to Deposit? ");
			deposit = input.nextDouble();
			howmuch = howmuch + deposit;
			System.out.println("The balance in the account is now " +howmuch);
			break;
		case 2:
			System.out.println("How much do you want to WithDrawl? ");
			withdrawal= input.nextDouble();
			howmuch = howmuch-withdrawal;
			System.out.println("The balance in the account is now " +howmuch);
			break;
		case 3:
			System.out.println("Check Balance");
			break;
		case 4:
			System.out.println("LogOut");
			quit=true;
			break;
			
	
		
		}
		}
		
	}

}
