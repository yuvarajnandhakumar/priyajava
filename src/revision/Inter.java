package revision;

public class Inter {
	
	
	public void test1() {
		System.out.println("priyanka");
	}
	
	public void test1(String s) {
		System.out.println(s);
	}
	
	public void test1(String s,int n) {
		System.out.println(s  +"  "+n);
	}
	public void test1(int n, String s) {
		System.out.println(s);
		System.out.println(n);

	}
	
	
	public static void main(String[] args) {
		Inter oo = new Inter();
		oo.test1();
		oo.test1("yuvaraj");
		oo.test1(10, "yuu");
		oo.test1("yyy", 20);
		oo.test1("priya");
		
	}
}

