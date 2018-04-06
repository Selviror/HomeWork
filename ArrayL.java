package CollectionLATH;

import java.util.*;
public class ArrayL { 
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		for (int i = 0; i <=9999; i++) {
			a.add("a" + i);
		}
		System.out.println(a);
		System.out.println(System.currentTimeMillis());
		a.remove(2);
		System.out.println(a);
		System.out.println(System.currentTimeMillis());
		int s = a.indexOf("a9997");
		System.out.println("Find :" + s);
		System.out.println(System.currentTimeMillis());
	}
	
}
