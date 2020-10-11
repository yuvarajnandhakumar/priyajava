package outside;

import Staticfinalfub.ab;

public class Out extends ab {

	public Out()
	{

	System.out.println("parent def constructor");	
	}
	
	public void method()
	{
	System.out.println("method");	
	}	public Out(String z)
	{
	System.out.println("parent para const" +z);	
	}
	
	public static void main(String[] args) {
        Out y=new Out();
        Out z=new Out("apple");
        ab.method2();
        z.method3();
       // y.method();
        
	}

}
