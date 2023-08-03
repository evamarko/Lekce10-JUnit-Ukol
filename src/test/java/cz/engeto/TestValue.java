package cz.engeto;

import java.util.List;

public class TestValue {
    List<Double> testList;
    double expectedValue;
    double maxTreshold;
    double minTreshold;

    public TestValue(List<Double> testList, double expectedValue, double maxTreshold, double minTreshold) {
        this.testList = testList;
        this.expectedValue = expectedValue;
        this.maxTreshold = maxTreshold;
        this.minTreshold = minTreshold;
    }

    public List<Double> getTestList() {
        return testList;
    }

    public void setTestList(List<Double> testList) {
        this.testList = testList;
    }

    public double getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(double expectedValue) {
        this.expectedValue = expectedValue;
    }

    public double getMaxTreshold() {
        return maxTreshold;
    }

    public void setMaxTreshold(double maxTreshold) {
        this.maxTreshold = maxTreshold;
    }

    public double getMinTreshold() {
        return minTreshold;
    }

    public void setMinTreshold(double minTreshold) {
        this.minTreshold = minTreshold;
    }
}
