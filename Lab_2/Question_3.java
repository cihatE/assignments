package Lab_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter a positive non-zero value:");
				
				int x = sc.nextInt();
				
				int sum = 0;
				for(int i=1; i<=x; i++) {
					sum+=i;
				}
				System.out.println("The sum of the integers from 1 until " + x + " = " + sum);
	}

}
