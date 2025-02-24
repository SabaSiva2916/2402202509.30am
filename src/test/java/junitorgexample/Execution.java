package junitorgexample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Sample.class, Sample2.class })
public class Execution {

	public static void main(String[] args) {

		Result runClasses = JUnitCore.runClasses(Sample.class, Sample2.class);
		// In Result class
		// getRunCount()
		// getIgnoreCount()
		// getFailureCount()
		// getFailures()
		int runCount = runClasses.getRunCount();
		System.out.println("Run Count :"+ runCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Ignore Count :"+ ignoreCount);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("Failure Count :"+ failureCount);
		
		List<Failure> failures = runClasses.getFailures();
		
		for (Failure failure : failures) {
			System.out.println(failure);
		}
	}
}
