package classAtRoom;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number=10;
		int firstNu=0;
		int secondNumber=1;
		System.out.println(number);
		System.out.println(firstNu+" "+secondNumber);
		for (int i =2; i <number; i++) {
			int fibo=firstNu+secondNumber;
			System.out.println(fibo);
			firstNu=secondNumber;
			secondNumber=fibo;
			
		}	
	}

}
