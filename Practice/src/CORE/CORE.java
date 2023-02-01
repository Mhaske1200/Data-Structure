package CORE;

public class CORE {

	public static void main(String[] args) {
		String s = "Hello";
		StringBuilder r;
		
		StringBuilder sb = new StringBuilder(s);
		r = sb.reverse();
		
		
		
//		for(int i = s.length()-1 ; i >= 0 ; i--)
//		{
//			r +=s.charAt(i);
//		}
//		for(int i = 0 ; i<s.length(); i++)
//		{
//			r = s.charAt(i)+ r;
//			//r += s.charAt(i);
//		}
		
		System.out.println(r.toString());

	}

}
