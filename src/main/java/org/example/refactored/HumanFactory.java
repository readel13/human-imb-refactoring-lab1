package org.example.refactored;

import org.example.refactored.errors.HumanException;

public class HumanFactory {
    public static Human getInstance(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new HumanException("Weight and height must be positive and non zero values");
        }
        return new Human(height, weight);
    }
}
