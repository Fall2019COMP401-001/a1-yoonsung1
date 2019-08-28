package a1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemNum = scan.nextInt();
		ArrayList<String> itemList = new ArrayList<String> ();
		ArrayList<Double> priceList = new ArrayList<Double> ();
		
		for (int i = 0; i < itemNum; i++)
		{
			String itemName = scan.next();
			itemList.add(itemName);
			double itemPrice = scan.nextDouble();
			priceList.add(itemPrice);
			//priceList.add(String.format("%.2f", itemPrice));
		}
		
		int cusNum = scan.nextInt();
		
		ArrayList<String> firstList = new ArrayList<String> ();
		ArrayList<String> lastList = new ArrayList<String> ();
		ArrayList<Double> totalList = new ArrayList<Double> ();
		//ArrayList<Integer> quanList = new ArrayList<Integer> ();
		
		int array[] = new int[itemList.size()];
		for (int i = 0; i < itemList.size(); i++)
		{
			array[i] = 0;
		}
		
		for (int i = 0; i < cusNum; i++)
		{
			String firstName = scan.next();
			firstList.add(firstName);
			String lastName = scan.next();
			lastList.add(lastName);
			
			int buyNum = scan.nextInt();
			double totalPrice = 0;
			
				for (int j = 0; j < buyNum; j++)
				{
					int quantity = scan.nextInt();
					String itsName = scan.next();
					totalPrice += quantity * priceList.get(itemList.indexOf(itsName));
					
					int itemIndx = itemList.indexOf(itsName);
					//int addedValue = quantity + quanList.get(itemIndx);
					array[itemIndx] += quantity;
				}
			
				totalList.add(totalPrice);
		}
		
		for (int c = 0; c < array.length; c++)
		{
			if (array[c] != 0)
				{
					System.out.println(array[c] + " customers bought " + itemList.get(c));
				}
			else
				{
					System.out.println("No customers bought " + itemList.get(c));
				}
		}
		
	}
}
