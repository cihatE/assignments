package Lab_2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in); 
				
				System.out.println("Enter the charge for the meal: $");
				double charge = sc.nextDouble();
				
				double tax=charge*0.0675;
				double tip=(charge+tax)*0.2;
				double total=charge+tax+tip;
				
				System.out.println("Meal charge = $" + charge);
				System.out.println("Tax         = $" + tax);
				System.out.println("Tip         = $" + tip);
				System.out.println("-----------------------");
				System.out.println("Total Bill = $" + total);

	}

}
