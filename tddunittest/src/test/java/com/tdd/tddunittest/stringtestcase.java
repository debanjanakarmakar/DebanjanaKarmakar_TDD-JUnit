package com.tdd.tddunittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringtestcase {
	
	@Test
	void testlength1() {
		
		String s="s";
		String x=ManipulateString.Manipulate(s);
		assertEquals(x,"s");
		
	}

	@Test
	void testlength2() {
		
		String s="saa";
		String x=ManipulateString.Manipulate(s);
		assertEquals(x,"sa");
		
	}
	
	@Test
	void testlength2witha() {
		
		String s="aa";
		String x=ManipulateString.Manipulate(s);
		assertEquals(x,"");
		
	}
	
}
