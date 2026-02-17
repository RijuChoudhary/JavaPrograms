package ab;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(45);
		v1.add(21);
		v1.add(63);
		v1.add(74);
		System.out.println(v1.removeElement(21));
		System.out.println(v1);
		System.out.println(v1.firstElement());
		
		Enumeration<Integer> e1=v1.elements();
		
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}
