package org.example.refactored.utils;

import org.example.refactored.Human;

public class HumanUtil {

    public static double getBodyMassIndex(Human human) {
        if (human == null) {
            throw new IllegalArgumentException("Null value was provided");
        }
        return human.getWeightInKg() / (human.getHeightInMeters() * human.getHeightInMeters());
    }

    public static String getAnalytics(Human human) {
        double imb = getBodyMassIndex(human);

        if (imb >= 18.5 & imb < 25) {
            return "Norm";
        } else if (imb >= 25 & imb < 30) {
            return "Warning!";
        } else if (imb >= 30) {
            return "Fat";
        } else {
            return "Deficit";
        }
    }
}
