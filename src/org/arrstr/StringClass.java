package org.arrstr;

public class StringClass {
	public void stringMethod() {
		/*String s="priyankka";
		char[] c= s.toCharArray();
		int l=c.length;
		for(int i=0;i<l;i++) {
			//System.out.println(c[i]);
			for(int j=i+1;j<l;j++) {
				if(c[i]==c[j]) {
					System.out.println(c[i]);
				}
			}
		}*/
		
		
		StringBuilder y = new StringBuilder("hi priyanka");
		StringBuilder yy = y.reverse();
		System.out.println(yy);
		
		String z="hi priyanaka";
		String[] ss = z.split(" ");
		int ll = ss.length;
		for(int i=ll-1;i>=0;i--)
		{
			System.out.print(ss[i] +" ");
		}
		System.out.println();
		for(int i=0;i<ll;i++)
		{
			StringBuilder b = new StringBuilder(ss[i]);
			StringBuilder rrr = b.reverse();
			System.out.print(rrr +" ");
		}
		System.out.println();
		
		String u="yuvaraj";
		String rrrr = u.replace("a", "e");
		System.out.println(rrrr);
		
	}
	public static void main(String[] args) {
		StringClass s=new StringClass();
		s.stringMethod();


	}
}
