package junitorgexample;

import org.junit.Ignore;
import org.junit.Test;

public class Sample {

	@Test
	public void tc01() {
		System.out.println("Method 1");
		System.out.println("Checking Assert condition");

		System.out.println("End!!!");
	}

	@Test
	public void tc02() {
		System.out.println("Method 2");
	}

	@Test
	public void tc03() {
		System.out.println("Method 3");
	}

	@Ignore
	@Test
	public void tc04() {
		System.out.println("Method 4");
	}

	@Test
	public void tc05() {
		System.out.println("Method 5");
	}

	public static void main(String[] args) {

		// String Reverse Program
		String str = "India";
		String output = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			output = output + c;
		}

		System.out.println("Reverse of given String is :" + output);
	}
}
