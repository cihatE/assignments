package Lab_2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	
			int smallest;
			int largest;
			int x;
			
			System.out.print("Enter your first number: ");
			int input1=sc.nextInt();
			
			smallest=input1;
			largest=input1;
			
			do {
				System.out.print("Enter your next number: ");
				input1=sc.nextInt();
				
				System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
					x=sc.nextInt();
				
				if(input1<smallest) {
					smallest=input1;
				}else if(input1>largest) {
					largest=input1;
				}
				if(x==0) {
					break;
				}else if(x!=0 && x!=1) {
					
					do{
					System.out.print("Wrong Option. If you wish to Enter another number select 1 or select 0 to exit");
						x=sc.nextInt();
					}while(x!=0 && x!=1);		
				}	
			}		while(x==1);
			
				System.out.println("Smallest Number is: " + smallest);
				System.out.println("Largest Number is: " + largest);
		
	
	}

}
