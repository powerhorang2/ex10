package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test_a() {
		int n1 = 1;
		int n2 = 1;
		int sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
	}
	
	@Test
	void test_b() {
		int n1 = 3;
		int n2 = 4;
		int sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
	}
	
	@Test
	void test_c() {
		int n1 = 4;
		int n2 = 4;
		int sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
	}
	
	@Test
	void test_d() {
		int n1 = 5;
		int n2 = 5;
		int sum = n1 + n2;
		assertEquals(sum, Calc.sum(n1, n2));
	}

}
