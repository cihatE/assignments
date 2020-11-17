package Lab_2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				System.out.println("How many Male are registered in the class: ");
				double male = sc.nextDouble();
				
				System.out.println("How many Female are registered in the class");
				double female = sc.nextDouble();
				
				double total=male+female;
				
				double femalePercent=(female/total)*100;
				
				double malePercent=(male/total)*100;
				
				System.out.println("The percentage is: " + malePercent + "% males and " + femalePercent + "% females. ");

	}

}
