package org.smpl1;

public class A {
	public static void main(String[] args) {

		String str = "mobileprogramming";
		String[] split = str.split("(?<=mobile)");
		
		System.out.println(split[0]);
		System.out.println(split[1]);

	}
}
