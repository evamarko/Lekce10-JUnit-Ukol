package cz.engeto;

import java.util.List;

public class Find {

    public static Double findMatching(List<Double> list, Double lowerLimit, Double upperLimit) {
        for(Double item : list) {
            if(item >= lowerLimit && item <= upperLimit) {
                return item;
            }
        }
        return null;
    }
}
