package org.example;

import org.example.refactored.Human;
import org.example.refactored.HumanFactory;
import org.example.refactored.utils.HumanUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();

        Human human = HumanFactory.getInstance(weight, height);

        double bodyMassIndex = HumanUtil.getBodyMassIndex(human);
        String analytics = HumanUtil.getAnalytics(human);
        System.out.printf("Hey %s, your Body Mass index is: %.2f. And this is: %s", name, bodyMassIndex, analytics);
    }
}
