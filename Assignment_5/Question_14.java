package assignments.Assignment_5;

public class Question_14 {

	public static void main(String[] args) {

		int rows=7;
		
		for(int i=1; i<=rows; i++) {
				System.out.print("#");
			for(int j=1; j<=(i-1); j++) {
				if(i==1) {			
				}else{
					System.out.print(" ");
				}
				
			}
				
			System.out.println("#");	
		}
	}

}
