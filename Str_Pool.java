package com;

public class Str_Pool {

	public static void main(String[] args) {
		//Here both s1 and s2 refers the one value created in string pool
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1==s2);
		// Here both s3 and s4 refers to two values in heap memory
		String s3 = new String("s3");
		String s4 = new String("s3");
		System.out.println(s3==s4);
		/*System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));*/

	}

}
