package CollectionLATH;

import java.util.*;
public class LinkedL {
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		for (int i = 0; i <= 9999; i++) {
			l.add("l" + i);
		}
		System.out.println(l);
		System.out.println(System.currentTimeMillis());
		l.remove(2);
		System.out.println(l);
		System.out.println(System.currentTimeMillis());
		int s = l.indexOf("l9997");
		System.out.println("Find :" + s);
		System.out.println(System.currentTimeMillis());
	}

}
