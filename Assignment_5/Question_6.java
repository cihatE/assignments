package assignments.Assignment_5;

public class Question_6 {

	public static void main(String[] args) {


		int n = 20;
		 int previousNum = 0;
		 int nextNum = 1;
	       
		 System.out.print("Fibonacci Series of "+n+" numbers: ");
	        int i=1;
	        while(i <= n) {
	            System.out.print(previousNum+" ");
	            int sum = previousNum + nextNum;
	            previousNum = nextNum;
	            nextNum = sum;
	            i++;
		
		}
		
		
	}

}
