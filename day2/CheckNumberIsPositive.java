package week2.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		int num = -10;
		
		if(num>0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num<0){
			System.out.println(num+" is negative");
		}
		else
			System.out.println(num+" is neutral");

	}

}
