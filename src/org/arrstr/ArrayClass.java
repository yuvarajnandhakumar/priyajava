package org.arrstr;

public class ArrayClass {
	public void arrayMethod()
	{
		int a[]= {8,9,5,7};
		int l = a.length;
		for(int i=0;i<l;i++) {
		//	if(a[i]%2!=0) {
				
				System.out.println(a[i]);
			}
		//}
		for(int i=l-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}


		int []b= {1,2};
		String s[]= {"priya","yuvaraj"};
		int c[]=new int[5];
		c[0]=1;
	//	System.out.println(c[0]);

	}
	public static void main(String[] args) {
		ArrayClass t=new ArrayClass();
		t.arrayMethod();

	}

}
