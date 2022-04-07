package TestDrivenRange;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import TestDrivenRange.TestDrivenRange;

import org.junit.Test;

public class TestDrivenRangeTest {

  @Test
  public void testRange() {
    assertNull(TestDrivenRange.findNoOfReadingsInRange());
    assertNull(TestDrivenRange.findNoOfReadingsInRange(4));
    assertNotEquals("4-5,3", TestDrivenRange.findNoOfReadingsInRange(4, 5).get(0));
    assertEquals("4-5,2", TestDrivenRange.findNoOfReadingsInRange(4, 5).get(0));
    assertEquals("4-7,4", TestDrivenRange.findNoOfReadingsInRange(4, 5, 6, 7).get(0));

    List<String> actualOutput = TestDrivenRange.findNoOfReadingsInRange(3, 3, 5, 4, 7, 8, 9);
    assertEquals("3-5,4", actualOutput.get(0));
    assertEquals("7-9,3", actualOutput.get(1));

    List<String> actualOutput1 = TestDrivenRange.findNoOfReadingsInRange(5, 4, 7, 8, 9);
    assertEquals("4-5,2", actualOutput1.get(0));
    assertEquals("7-9,3", actualOutput1.get(1));

    List<String> actualOutput2 = TestDrivenRange.findNoOfReadingsInRange(4, 7, 8, 9);
    assertEquals("7-9,3", actualOutput2.get(0));
  }

  @Test
  public void testFindRangesForA2DInpt() {
    List<String> actualOutput = TestDrivenRange.findRangesForA2DInput(1228, 1228, 2047, 1637, 2865, 3275, 3684);
    assertEquals("3-5,4", actualOutput.get(0));
    assertEquals("7-9,3", actualOutput.get(1));
  }

  @Test
  public void testConvertA2DListIntoAmps() {
    int[] sampleInAmps = TestDrivenRange.convertA2DListIntoAmps(4092, 4503, 1146);
    assert (10 == sampleInAmps[0]);
    assert (3 == sampleInAmps[1]);

    int[] sampleInAmps1 = TestDrivenRange.convertA2DListIntoAmps();
    assert (0 == sampleInAmps1.length);
  }

  @Test
  public void testConvertA2DInputToAmps() {
    assertEquals(10, TestDrivenRange.convertA2DInputToAmps(4092));
    assertEquals(10, TestDrivenRange.convertA2DInputToAmps(4094));
    assertEquals(9, TestDrivenRange.convertA2DInputToAmps(3800));
  }

  @Test
  public void testRoundOffToNearestInteger() {
    assertEquals(0, TestDrivenRange.roundOffToNearestInteger(0f));
    assertEquals(0, TestDrivenRange.roundOffToNearestInteger(0.4f));
    assertEquals(1, TestDrivenRange.roundOffToNearestInteger(0.5f));
    assertEquals(1, TestDrivenRange.roundOffToNearestInteger(0.6f));
  }

}
