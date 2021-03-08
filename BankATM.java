import java.util.*;
public class BankATM {
	public static void main(String[]args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome To the ATM project!");
			System.out.print("Enter your Customer Number :");
			double custom=sc.nextDouble();
			System.out.print("Enter Your PIN :");
			double balance=0;
			double sbalance=0;
			int pin=sc.nextInt();
			if((custom==1234567)&&(pin==1234))
			{
				while(true) {
					System.out.println("Type 1:- Checking Account\nType 2:- Saving Account\nType 3:- Exit");
					System.out.print("Choice :");
					int choice=sc.nextInt();
					if(choice==1) {
						while(true) {
							System.out.println("Checking Account:\nType 1:- View Balance\nType 2:- Withdrawl Funds\nType 3:- Deposit Funds\nType 4:- Exit");
							System.out.print("Choice :");
							int ch=sc.nextInt();
							if(ch==1)
							{
								System.out.println("Account Balance : $"+balance);
							}
							else if(ch==2) {
								System.out.print("Enter the Amount you want to withdrawl :");
								int w=sc.nextInt();
								if(w>balance) {
									System.out.println("You Can't Withdrawl $"+w+"Amount");
									System.out.println("Your Account Balance $"+balance);
								}
								else {
									balance=balance-w;
									System.out.println("Your New Balance is : $"+balance);
								}
							}
							else if(ch==3) {
								System.out.print("Enter the Amount You Want To Deposit :");
								int d=sc.nextInt();
								balance=balance+d;
								System.out.println("Your New Balance is : $"+balance);
							}
							else if(ch==4)
							{
								System.exit(0);
							}
							else {
								System.out.println("Invalid Input!");
							}
						}
					}
					else if(choice==2) {
						while(true) {
							System.out.println("Savings Account:\nType 1:- View Balance\nType 2:- Withdrawl Funds\nType 3:- Deposit Funds\nType 4:- Exit");
							System.out.print("Choice :");
							int ch=sc.nextInt();
							if(ch==1)
							{
								System.out.println("Savings Account Balance : $"+sbalance);
							}
							else if(ch==2) {
								System.out.print("Enter the Amount you want to withdrawl :");
								int sw=sc.nextInt();
								if(sw>sbalance) {
									System.out.println("You Can't Withdrawl $"+sw+"Amount");
									System.out.println("Your Account Balance $"+sbalance);
								}
								else {
									sbalance=sbalance-sw;
									System.out.println("Your New Balance is : $"+sbalance);
								}
								
							}
							else if(ch==3) {
								System.out.print("Enter the Amount You Want To Deposit :");
								int d=sc.nextInt();
								sbalance=sbalance+d;
								System.out.println("Your New Savings Balance is : $"+sbalance);
							}
							else if(ch==4)
							{
								System.exit(0);
							}
							else {
								System.out.println("Invalid Input!");
							}
						}
					}
					else if(choice==3) {
					            	System.exit(0);
					}
					else {
						System.out.println("Invalid Input!");
					}
				}
			}
			else
			{
				System.out.println("Invalid Input!");
			}
			System.out.println("Thank You!");
			
		}
		
}