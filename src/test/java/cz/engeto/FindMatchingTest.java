package cz.engeto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FindMatchingTest {

    @Test
    public void firstTest() {
        List<Double> testList = List.of(12.0, 8.126, 6.0);
        Double testResult = Find.findMatching(testList, 11.0, 12.6);
        Assertions.assertEquals(12.0, testResult);
    }

    @Test
    public void secondTest() {
        List<Double> testList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        Double testResult = Find.findMatching(testList, 8.0, 10.0);
        Assertions.assertEquals( 8.126, testResult);
    }

}
