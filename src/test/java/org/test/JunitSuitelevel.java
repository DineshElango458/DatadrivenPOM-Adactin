package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

	
	
	@RunWith(Suite.class)
@SuiteClasses({JunitSample.class,JunitS2.class,JunitS3.class})
public class JunitSuitelevel {
	public static void main(String[] args) {
		
	Result r = JUnitCore.runClasses(JunitSample.class,JunitS2.class,JunitS3.class);
	
	int runCount = r.getRunCount();
	System.out.println("runcount"+ runCount);
	
	
	int ignoreCount = r.getIgnoreCount();
	System.out.println("ignorecount is"+ ignoreCount);
	
	int failureCount = r.getFailureCount();
	System.out.println("failurecount is"+failureCount);
	
	
	List<Failure> failures = r.getFailures();
	
	for (int i = 0; i<failures.size(); i++) {
		Failure failure = failures.get(i);
		System.out.println(failure);
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
}