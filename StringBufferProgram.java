package ab;

public class StringBufferProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1=new StringBuffer("Automation Test");
		System.out.println(s1.reverse());
		//s1.delete(11, 15);
		System.out.println(s1.delete(10, 15));
		System.out.println(s1.replace(0, 10, "Manual"));
		
		StringBuffer s2=new StringBuffer("API Testing");
		//System.out.println(s2.insert(3, "SDET"));
		System.out.println(s2.substring(0));
		System.out.println(s2.substring(4, 6));

	}

}
