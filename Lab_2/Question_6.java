package Lab_2;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the purchase amount: $");
				double purchaseAmount = sc.nextDouble();
				
				System.out.println();
				
				double stateTax=purchaseAmount*0.04;
				double countryTax=purchaseAmount*0.02;
				double totalSalesTax=stateTax+countryTax;
				double totalBuyingPrice=purchaseAmount+totalSalesTax;
				
				System.out.println("Purchase amount          = $" + purchaseAmount);
				System.out.println("State Sales Tax          = $" + stateTax);
				System.out.println("Country Sales Tax        = $" + countryTax);
				System.out.println("Total Sales Tax          = $" + totalSalesTax);
				System.out.println("-----------------------------------------------");
				System.out.println("Total Bill               =" + totalBuyingPrice);

	}

}
