package junitorgexample;

import org.junit.Assert;

public class Sample2 {

	@org.junit.Test
	public void tc01() {
		System.out.println("Method 21");
		System.out.println("Checking Assert condition");
		Assert.assertTrue(false);
		System.out.println("End!!!");
	}

	@org.junit.Test
	public void tc02() {
		System.out.println("Method 22");
	}

	@org.junit.Test
	public void tc03() {
		System.out.println("Method 23");
	}

	@org.junit.Test
	public void tc04() {
		System.out.println("Method 24");
	}

	@org.junit.Test
	public void tc05() {
		System.out.println("Method 25");
	}

}
