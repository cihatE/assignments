package Lab_2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				int cookies=40;
				int caloriesPerServing=300;
				int servingsInBag=10;
				
				int serving=cookies/servingsInBag;
				int caloriesPerCookies=caloriesPerServing/serving;
				
				System.out.println("How many Cookiesdid you eat? ");
				int result=sc.nextInt();
				
				int calories=result*caloriesPerCookies;
				
				System.out.println("You have consumed " + calories + " calories.");

	}

}
