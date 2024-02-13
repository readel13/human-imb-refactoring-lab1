package org.example.refactored;

import java.util.Objects;

public class Human {

    private final double heightInMeters;
    private final double weightInKg;

    Human(double height, double weight) {
        this.heightInMeters = height;
        this.weightInKg = weight;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Double.compare(heightInMeters, human.heightInMeters) == 0 && Double.compare(weightInKg, human.weightInKg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heightInMeters, weightInKg);
    }
}
