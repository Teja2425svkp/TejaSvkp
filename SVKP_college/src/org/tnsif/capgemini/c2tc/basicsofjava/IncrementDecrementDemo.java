package org.tnsif.capgemini.c2tc.basicsofjava;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
int a=10;
		
		//post increment
		System.out.println("a++  " + a++);//print first then increment
		System.out.println("after post-increment a   "+ a); //11
		
		//pre increment
		System.out.println("++a  " + ++a);//increment first ,then prints
		
		//post decrement
		System.out.println("a--  " + a--);//prints first then decrement //12
		System.out.println("after post decrement a   " + a); //11
		
		//pre decrement
		System.out.println("--a "+ --a);
	}


	}
