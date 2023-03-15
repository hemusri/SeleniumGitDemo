package practic;

public class StringRevers 
{
	
	public static void main(String[] args) 
	{
		
		String a="RBG Techologies";
		
		String r = "";
		
		StringBuffer s = new StringBuffer(a);
		s.reverse();
		System.out.println(s);
		
//		for(int i=0; i<a.length(); i++)
//		{
//			r=a.charAt(i)+r;
//		}
//		System.out.println(r);
		
	}

}
