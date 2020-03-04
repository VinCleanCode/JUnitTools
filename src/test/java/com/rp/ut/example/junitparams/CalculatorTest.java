package com.rp.ut.example.junitparams;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

//Ref URL: https://ithelp.ithome.com.tw/articles/10196376
@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

	@Test
	@Parameters(value = {"0, 0, 0, print1, true", "1| 1| 2| print2| false"})
	@TestCaseName("test case 1 -> first: {0}, second: {1}, expect: {2}, print: {3}, something: {4}")
	public void testCase1(int first, int second, int expectedSum, String print, boolean trueFalse) {
	}
}