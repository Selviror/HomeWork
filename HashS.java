package CollectionLATH;

import java.util.*;
public class HashS { 
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		for (int i = 0; i <= 9999; i++) {
			h.add("h" + i);
		}
		System.out.println(System.currentTimeMillis());
		System.out.println(h);
		System.out.println(System.currentTimeMillis());
		h.remove(2);
		System.out.println(h);
		System.out.println(System.currentTimeMillis());
//		int s = h.indexOf("a7");
//		System.out.println("Find :" + s);
//		System.out.println(System.currentTimeMillis());
	}

}
