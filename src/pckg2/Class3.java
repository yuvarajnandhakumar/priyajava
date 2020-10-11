package pckg2;

import pckg1.Class1;

public class Class3 extends Class1 {
	public void method3() {
}

public static void main(String[] args) {
	Class3 u=new Class3();
	u.method3();
	u.method1();
	Class1 f = new Class1();
	f.method1();
}
}
