package week2.day2;

public class IsPrime {

	public static void main(String[] args) {
		int num = 17;
		boolean flag = true;
		
		for(int i = 2; i<num; i++)
		{
			 if(num % i ==0) {
				 flag = false;
			 }
		}
		
		if(flag) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not prime number");
		}
		
}
}

