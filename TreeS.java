package CollectionLATH;

import java.util.*;
public class TreeS {   
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		for (int i = 0; i <= 9; i++) {
			t.add("t" + i);					
		}
		System.out.println(System.currentTimeMillis());
		System.out.println(t);
		System.out.println(System.currentTimeMillis());
//		t.remove(1);
//		System.out.println(t);
//		System.out.println(System.currentTimeMillis());
//		String s = t.indexOf("t10");
//		System.out.println("Find :" + s);
//		System.out.println(System.currentTimeMillis());
	}

}
