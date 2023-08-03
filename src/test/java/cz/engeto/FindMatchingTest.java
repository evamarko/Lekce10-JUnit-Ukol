package cz.engeto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import java.util.List;

public class FindMatchingTest {

    List<TestValue> testValue = List.of(
            new TestValue(List.of(12.0, 8.126, 6.0), 12.0, 12.6, 11),
            new TestValue(List.of(12.0, 8.126, 9.0, 158.0, 6.0), 8.126, 10.0, 8.0));

    @RepeatedTest(2)
    public void matchingTest(RepetitionInfo repetitionInfo) {
        List <Double> testList = testValue.get(repetitionInfo.getCurrentRepetition()).getTestList();
        Double testResult = Find.findMatching(
                testList,
                testValue.get(repetitionInfo.getCurrentRepetition()).getMinTreshold(),
                testValue.get(repetitionInfo.getCurrentRepetition()).getMaxTreshold());
        Assertions.assertEquals(testValue.get(repetitionInfo.getCurrentRepetition()).getExpectedValue(), testResult);
    }

 /*   @Test
    public void checkOneNumberFirstTest() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double testResult = Find.findMatching(testList, 11.0, 12.6);
        Assertions.assertEquals(12.0, testResult);
    }

    @Test
    public void checkOneNumberSecondTest() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Double testResult = Find.findMatching(testList, 8.0, 10.0);
        Assertions.assertEquals( 8.126, testResult);
    }*/
}
