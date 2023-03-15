package practic;

public class Palindromenumber {

	public static void main(String[] args) {

		int n=121, r=0, sum=0;
		
		while(n!=0)
		{
			r=n%10;           //r=121%10; , r=1;
			sum = sum*10+r;   // sum = 0*10+1;  ,sum = 1
			n=n/10;           //n=121/10;  n=12;
		}
		System.out.println(sum);
		
		if(sum==n)
		{
			System.out.println("palidrome number");
		}
		else
		{
			System.out.println("not palidrome");
		}
	}

}
