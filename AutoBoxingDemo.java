import java.util.LinkedList;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		System.out.println((2.0f-1.8f));
		int m = 100;
		Integer gg = m;
		gg++;
		int p = 100;
		Integer d = new Integer(p);
		LinkedList l = new LinkedList();
		l.add(d);
		l.add(new Integer(200));
		Integer b = (Integer)l.get(0) ;
		int c = b.intValue();
		c++;
		b = new Integer(c);
		l.add(0, new Integer(c));
		System.out.println(l);
		int x =100;
		Integer y = new Integer(127);
		int y1 = y.intValue();
		y1++;
		Integer y2 = 127;
		Integer v3 = Integer.valueOf(100);
		System.out.println(y==y2);
		//Integer z = new Integer(100);
		String v = "Hello";
		String v1 = new String("Hello");

	}

}
