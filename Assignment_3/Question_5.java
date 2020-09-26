package assignments.Assignment_3;

public class Question_5 {

	public static void main(String[] args) {
		
			int hours , minutes , seconds, inputSeconds; 
			
			hours = 1;
			minutes = 1;
			seconds = 35;
			inputSeconds = 3695;
			
			System.out.println("inputSeconds is " + inputSeconds);
			
			hours = (inputSeconds/3600);
			minutes = (inputSeconds/60) %60;
			seconds = (inputSeconds%60);
			
			System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
			
			
			
			
			
			
			

	}

}
