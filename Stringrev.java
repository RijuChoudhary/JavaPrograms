package ab;

import java.util.Date;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mam";
		String out="";
		for(int i=a.length()-1;i>=0;i--) {
			char c1=a.charAt(i);
				out=out+c1;
			}
		System.out.println("input is->a");
		System.out.println("output is->out");
		if(a.equals(out)) {
			System.out.println("string is planidrome");
		}
		else {
			System.out.println("not a palindrome");
			
			
			
		}
		Date d1=new Date();
		System.out.println(d1.getTime());
		System.out.println(d1.getDate());
		
		}

	}


