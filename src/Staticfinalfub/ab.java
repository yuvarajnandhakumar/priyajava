package Staticfinalfub;

public class ab {
	
	
	
	static int x=10;
	final int y=20;
	
	public void method1()
	{
		int x=15;
		System.out.println(x);
		System.out.println(y);
		x=20;
		//y=30;
	}
	
	public static void method2()
	{
		System.out.println(x);
		x=50;
	}
	
	public final void method3()
	{
		System.out.println(x);
		x=50;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		ab y=new ab();
		y.method1();
		y.method2();
		y.method2();
		
		ab.method2();
		
		
	}
}
