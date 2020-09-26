package assignments.Assignment_3;

public class Question_7 {

	public static void main(String[] args) {
		
		int dollarBill , price , quarters , dimes , nickles , change;
		
		dollarBill=100;
		price=95;
		change=dollarBill-price;
		quarters=(change/25);
		dimes=((change%25)/10);
		nickles=(((change%25)%10)/5);
		
		System.out.println("Price in cents : " +price);
		System.out.println("Your chage is " +quarters+ " quarters, " + dimes + " dimes, " + nickles + " nickles");
		

	}

}
