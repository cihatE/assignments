package assignments.Assignment_5;

public class Question_13 {

	public static void main(String[] args) {

			
		int rows=8;
		int columns=8;
		int result=0;
		
		for(int i=1; i<=rows; i++ ) {
			for(int j=1; j<=columns; j++) {
				result=i+j;
				if(result%2==0) {
					System.out.print("W ");
				}else if(result%2!=0) {
					System.out.print("B ");
				}
			}
				
			System.out.println(" ");	
		}
		

	}

}
