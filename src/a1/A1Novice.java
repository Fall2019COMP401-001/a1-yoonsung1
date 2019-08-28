package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numCus = scan.nextInt();
		
		for (int i = 0; i < numCus; i++)
		{
			
			String firstName = scan.next();
			String[] splitFirst = firstName.split("");
			String lastName = scan.next();
			
			int itemNum = scan.nextInt();
			double totalPrice = 0;
			
				for (int j = 0; j < itemNum; j++)
				{
					int quantity = scan.nextInt();
					String itemName = scan.next();
					double itemPrice = scan.nextDouble();
					double eachPrice = itemPrice * quantity;
					totalPrice += eachPrice;
				}
	
			System.out.println(splitFirst[0] + "." + " " + lastName + ":" + " " + totalPrice);	
			
		}
		
	}
}
