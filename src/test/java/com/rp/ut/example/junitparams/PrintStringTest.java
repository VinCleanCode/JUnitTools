package com.rp.ut.example.junitparams;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PrintStringTest {

	@Test
	@Parameters(value = {"review"})
	public void test_printCollectionName(String inputCollection){
		PrintString printString = new PrintString();

		String collectionName = printString.printCollectionName(inputCollection);
		Assert.assertEquals(inputCollection,collectionName);
	}
}