package revision;

public class RideClass extends Inter{
	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		super.test1();
		System.out.println("ride class method1");
	}
	
	
	public void test1(int n, String s) {
		//super.test1(n, s);
		System.out.println("ride class method2");

	}
	
	public void method1()
	{
		String s="priya";
		
	}
	
	public int method11()
	{
		int s=44;
		return s;
		
	}
	
	
	public static void main(String[] args) {
		RideClass ii=new RideClass();
		ii.test1(1,"priya");
		ii.test1("yuvaraj");

	}

}
