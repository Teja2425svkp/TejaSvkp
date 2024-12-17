package org.tnsif.capgemini.c2tc.basicsofjava;

public class VariableDemo{
			int id=10; //instance variable
			void print()
			{
				String msg="hello"; //local variable
				System.out.println(msg);
			}
	
	static String message="Hello Students"; //static variable
	
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);
		
	}

}


