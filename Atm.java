package account;

import java.util.Scanner;

public class Atm {
	 private static final Scanner in = new Scanner(System.in);
	 
	 public static void main(String[] args) {
	        Account[] accounts = new Account[10];
	        for (int i = 1; i < 11; i++) {
	            accounts[i - 1] = new Account(i, 100.0);
	        }
	        
	        System.out.print("Enter an id form 1 - 10: ");
	        int id = in.nextInt();
	        
	        if (id < 1 || id > 10) {
	            id = incorrectId(id);
	        }
	        
	        while (true) {
	            menuDisplay();
	            System.out.print("Enter a choice: ");
	            int choice = in.nextInt();

	            if (choice == 4) {
	                System.out.printf("Enter an id (1 - 10): ");
	                id = in.nextInt();

	                if (id < 1 || id > 10) {
	                    id = incorrectId(id);
	                }
	            }
	            performChoice(id, choice, accounts);
	        }
	 }
	 
	 

	 
	private static int incorrectId(int id) {
		while(id < 1 || id > 10) {
			System.out.print("Please enter a valid id: ");
            id = in.nextInt();
            System.out.println();
		}
		return id;
	}
	 
	public static void performChoice(int id, int choice, Account[] accounts) {
        //Scanner in = new Scanner(System.in);
        switch (choice) {
            case 1: 
                System.out.println("The balance is " + accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.println("Enter the amount to withdraw: ");
                accounts[id - 1].withdraw(in.nextDouble());
                break;
            case 3:
                System.out.println("Enter the amount to deposit: ");
                accounts[id - 1].deposit(in.nextDouble());
                break;
            default:
                break;
        }
    }
	
	public static void menuDisplay() {
        System.out.println("Main menu: ");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
	 
}
	 
