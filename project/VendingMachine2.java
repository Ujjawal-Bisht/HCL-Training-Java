package project;

import java.util.Scanner;

public class VendingMachine2 {

	static String[] names = {"pepsi", "coke", "sprite", "fanta"};
	static int[] prices = {10, 20, 30, 40} ;
	static int[] stock = {5, 2, 10, 3} ;
	
	static Scanner sc = new Scanner(System.in) ;

	public static void main(String[] args) {
		System.out.println("""
				Enter wich function you want to perform:
				1 - order
				2 - update price
				3 - view stock
				4 - exit
				""");
		
		int ch = sc.nextInt();
		
		while(ch != 4) {
			if(ch == 1) order() ;
			else if(ch == 2) updatePrice() ;
			else if(ch == 3) viewStock() ;
			else System.out.println("Enter valid choice!");
			
			System.out.println("""
					You can select again. 
				1 - order
				2 - update price
				3 - view stock
				4 - exit
					""");
			ch = sc.nextInt();
		}

	}
	
	public static void order() {
		System.out.printf("""
				Menu
				1. pepsi: %d
				2. coke: %d
				3. sprite: %d
				4. fanta: %d
				5. Exit
				""", prices[0], prices[1], prices[2], prices[3]);
		
		int ch ;
		System.out.print("Enter your choice: ");
		ch = sc.nextInt() ;
		int bill = 0;
		
		while(ch != 5) {
			switch(ch) {
			case 1:
				if(stock[0] > 0) {
					bill += prices[0] ;
					stock[0]-- ;
				}else {
					System.out.println("pepsi out of stock!");
				}
				break ;
			case 2:
				if(stock[1] > 0) {
					bill += prices[1] ;
					stock[1]-- ;
				}else {
					System.out.println("coke out of stock!");
				}
				break ;
			case 3:
				if(stock[2] > 0) {
					bill += prices[2] ;
					stock[2]-- ;
				}else {
					System.out.println("sprite out of stock!");
				}
				break ;
			case 4:
				if(stock[3] > 0) {
					bill += prices[3] ;
					stock[3]-- ;
				}else {
					System.out.println("fanta out of stock!");
				}
				break ;
			default:
				System.out.println("Please enter a valid choice");
				break ;
			}
			
			System.out.print("Want to buy something else?: ");
			ch = sc.nextInt() ;
		}
		
		System.out.println("Your total bill is: " + bill);
	}
	
	public static void updatePrice() {
		System.out.println("""
				Select whose price you want to change:
				1 - pepsi \n2 - coke \n3 - sprite \n4 - fanta
				""");
		
		int ch = sc.nextInt();
		if(ch >= 1 && ch <= 4) {
		    System.out.print("Enter the new price: ");
		    prices[ch - 1] = sc.nextInt();
		}
		else {
		    System.out.println("Please enter valid input!!!");
		}
		
		if(ch == 1) {
			prices[0] = sc.nextInt() ;
		}else if(ch == 2) {
			prices[1] = sc.nextInt() ;
		}else if(ch == 3) {
			prices[2] = sc.nextInt() ;
		}else if(ch == 4) {
			prices[3] = sc.nextInt() ;
		}else {
			System.out.println("Please enter valid input!!!");
		}
	}

	public static void viewStock() {
		System.out.println("""
				Enter whose stock you want to check: 
				1 - pepsi \n2 - coke \n3 - sprite \n4 - fanta
				""");
		
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println(stock[0]);
		}else if(ch == 2) {
			System.out.println(stock[1]);
		}else if(ch == 3) {
			System.out.println(stock[2]);
		}else if(ch == 4) {
			System.out.println(stock[3]);
		}else {
			System.out.println("Please enter valid input!!!");
		}
	}
}
