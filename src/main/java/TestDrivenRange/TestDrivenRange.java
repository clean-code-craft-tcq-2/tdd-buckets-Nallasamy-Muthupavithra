package TestDrivenRange;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestDrivenRange {

  private static final String COMMA_SEP = ",";
  private static final String HYPHEN_SEP = "-";

  public static String[] findNoOfReadingsInRange(final int... curSamples) {
    if (curSamples.length < 2) {
      return null;
    }
    return detectReadings(curSamples);
  }

  private static String[] detectReadings(final int[] curSamples) {
    String[] outputArray = new String[curSamples.length];
    List<Integer> samplesList = Arrays.stream(curSamples).boxed().collect(Collectors.toList());
    Collections.sort(samplesList);
    StringBuilder builder = new StringBuilder();
    builder.append(samplesList.get(0));
    builder.append(HYPHEN_SEP);
    builder.append(samplesList.get(samplesList.size() - 1));
    builder.append(COMMA_SEP);
    builder.append(samplesList.size());
    outputArray[0] = builder.toString();
    System.out.println(outputArray[0]);
    return outputArray;
  }

}
