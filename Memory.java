package com;

public class Memory {

	public static void main(String[] args) {
		String s ="m";
		System.out.println(s);
		String s1 = new String("m");
		System.out.println(s1);
		//String Builder
		StringBuilder s3 = new StringBuilder("nu");
		System.out.println(s3);
		s3.append("rraain");
		System.out.println(s3);
		s3.insert(0, "shaik");
		System.out.println(s3);

	}

}
