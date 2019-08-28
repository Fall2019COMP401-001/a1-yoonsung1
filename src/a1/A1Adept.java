package a1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class A1Adept {

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
				}
			totalList.add(totalPrice);
			//totalList.add(String.format("%.2f", totalPrice));	
		}
		
		double biggestTotal = Collections.max(totalList);
		double smallestTotal = Collections.min(totalList);
		int indxOfBig = totalList.indexOf(biggestTotal);
		int indxOfSm = totalList.indexOf(smallestTotal);
		
		double sum = 0;
		
		for (int v = 0; v < cusNum; v++)
		{
			sum += totalList.get(v);
		}
		
		double avg = sum / cusNum;
		
		System.out.println("Biggest: " + firstList.get(indxOfBig) + " " + lastList.get(indxOfBig) + " (" + String.format("%.2f",totalList.get(indxOfBig))
			+ ")");
		System.out.println("Smallest: " + firstList.get(indxOfSm) + " " + lastList.get(indxOfSm) + " (" + String.format("%.2f",totalList.get(indxOfSm))
		+ ")");
		System.out.println("Average: " + String.format("%.2f", avg));
	}
}
