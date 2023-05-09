package in.inuron.bank;

import java.util.Scanner;

public class Banking_APP {

	public static void main(String[] args) {
		Bank_account obj = new Bank_account("Manank", 00001);
		obj.ShowMenu();	

	}

}
 class Bank_account{
	int Customerid;
	String Customername;
	int balance;
	int previous_transaction;
	
	public Bank_account(String cname , int cid) {
		Customername = cname;
		Customerid = cid;
	}
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previous_transaction = amount;
		}
	}
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previous_transaction = -amount;
		}
	}
	void getprevious_transaction() {
		if(previous_transaction > 0) {
			System.out.println("amount deposited :"+ previous_transaction);
		}
		else if(previous_transaction < 0){
			System.out.println("amount deposited :"+ Math.abs(previous_transaction));
		}
		else {
			System.out.println("no any amount is deposited");
		}
	}
	void ShowMenu() {
		char option  = '\0';
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to ineuron bank:" + Customername);
		System.out.println("your ID is :" + Customerid);
		System.out.println();
		System.out.println("**************************");
		System.out.println();
		System.out.println("press A to check balance");
		System.out.println("press B to deposit");
		System.out.println("press C to withdraw");
		System.out.println("press D for previous trsnsaction");
		System.out.println("press E to exit");
		do {
			System.out.println("enter your option");
			System.out.println();
			option = scan.next().charAt(0);
			
			switch(option) {
			case 'A':
				System.out.println("-------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to deposit ");
				System.out.println("-------------------------------------------------------");
				
				int amount = scan.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to withdraw ");
				System.out.println("-------------------------------------------------------");
				
				int amount2 = scan.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("-------------------------------------------------------");
				getprevious_transaction();
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E' :
				System.out.println("=========================================================================================================");
				break;

			default:
				System.out.println("Invalid Option!! Please Enter Correct Opton...");
				break;
			}			
		}
		while(option != 'E');
			System.out.println("Thank You for Using our Services.....!!");
			
		}
		
	
 
}
