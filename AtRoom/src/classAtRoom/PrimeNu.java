package classAtRoom;

public class PrimeNu {

	public static void main(String[] args) {
		int num=21;
		boolean isPrime=true;
		if(num<=1) {
			isPrime=false;
			
		}else {
			for (int i =2; i <=Math.sqrt(num); i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num +" is prime nu");
		}
		else {
			System.out.println(num+" is Not prime");
		}
	}

}
