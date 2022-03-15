package TestDrivenRange;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import TestDrivenRange.TestDrivenRange;

import org.junit.Test;

public class TestDrivenRangeTest {

  @Test
  public void testRange() {
    assertNull(TestDrivenRange.findNoOfReadingsInRange());
    assertNull(TestDrivenRange.findNoOfReadingsInRange(4));
    assertNotEquals("4-5,3", TestDrivenRange.findNoOfReadingsInRange(4, 5)[0]);
    assertEquals("4-5,2", TestDrivenRange.findNoOfReadingsInRange(4, 5)[0]);
    assertEquals("4-7,4", TestDrivenRange.findNoOfReadingsInRange(4, 5, 6, 7)[0]);
  }

}

