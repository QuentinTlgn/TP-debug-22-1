package tptests;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzbuzztest {

	@Test
	public void test0() {
		assertEquals(fizzbuzz.fizzBuzz(0), "0");
	}
	
	@Test
	public void test1() {
		assertEquals(fizzbuzz.fizzBuzz(1), "1");
	}

}
