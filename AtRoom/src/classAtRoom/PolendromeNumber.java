package classAtRoom;

public class PolendromeNumber {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int nu=121;
		temp=nu;
		while(nu>0) 
		{
		r=nu%10;
		sum=(sum*10)+r;
		nu=nu/10;
		}
		if(temp==sum) 
			System.out.println(" Polindrom");
		else {
			System.out.println("Not polindrom");
		}
		
	}

}
