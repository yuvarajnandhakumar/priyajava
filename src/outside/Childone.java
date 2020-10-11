package outside;

import java.security.PublicKey;

public class Childone extends Out {
	public Childone(String x)
	{
		super("priya");
		System.out.println("parameterized cobstructor"+x);
	}
	public Childone() 
	{
		this("yuva");
		System.out.println("child def constructor");
	}
	public static void main(String[] args) {
		Childone a=new Childone();
		//Childone b=new Childone("hhh");
	//	System.out.println();
	}

}
