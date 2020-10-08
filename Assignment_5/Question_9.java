package assignments.Assignment_5;

public class Question_9 {

	public static void main(String[] args) {
		
		
		int start=1;
		int end=10; 
		
		while(start<=end) {
			if(start%2!=0) {
				System.out.print(start);
			}else if(start==end) {
				System.out.print("");
			}else {
				System.out.print(",");
			}
				start++; 
		}
			
		
		
		
	}

}
