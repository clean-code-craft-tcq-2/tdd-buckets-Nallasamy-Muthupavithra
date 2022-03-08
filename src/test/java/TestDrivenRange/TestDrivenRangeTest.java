package TestDrivenRange;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import TestDrivenRange.TestDrivenRange;

public class TestDrivenRangeTest{

@Test
public void testRange(){ 
   assertTrue(TestDrivenRange.findNoOfReadingsInRange(4,5)==4-5,2);
}