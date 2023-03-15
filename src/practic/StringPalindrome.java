package practic;

public class StringPalindrome {

	public static void main(String[] args) {

		String a= "RBG Techologies";
		System.out.println(a.length());
		String rev = "";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			rev= rev+a.charAt(i);
		}
		System.out.println(rev);
		if(a.equals(rev))
		{
			System.out.println("palindrome number");
		}else
		{
			System.out.println("not palindrome number");
		}
	}

}
