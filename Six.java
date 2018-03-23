
public class Six {
	public static void main(String[] args) {
		int n, a, b, c, d;
		n = 1345;
		a = n/1000;
		b = n/100%10;
		c = n/10%10;
		d = n%10;
		if (a!=b & b!=c & c!=d & d!=a)
				System.out.println("All numbers different");
		else System.out.println("All numbers not different");
/*		System.out.println(n);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
	}
}
