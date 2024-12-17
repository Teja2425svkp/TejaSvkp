package org.tnsif.capgemini.c2tc.basicsofjava;

class Demo
{
	
	int i;
	byte b;
	float f;
	double d;
	char c1;
	boolean b1;
	String strvalue;//instance var
	int a[];
}
    public class DefaultValuesChecking {
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1.i);
		System.out.println(d1.b);
		System.out.println(d1.f);
		System.out.println(d1.d);
		System.out.println(d1.c1 ); //not visible when printed because it is null character
		System.out.println(d1.b1);
		System.out.println(d1.strvalue);
		System.out.println(d1.a);

	}
}

