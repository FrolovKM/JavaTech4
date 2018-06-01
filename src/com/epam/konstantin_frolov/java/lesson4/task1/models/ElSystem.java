package com.epam.konstantin_frolov.java.lesson4.task1.models;

import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoPowerException;
import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoWeightException;
import com.epam.konstantin_frolov.java.lesson4.task1.interfaces.ESystem;

import java.util.Arrays;

public class ElSystem implements ESystem {
    private Something[] something = null;

    public ElSystem(int n) {
        if (n < 0) {
            throw new NegativeArraySizeException("Not correct array size!");
        }
        this.something = new Something[n];
    }

    public Something[] getSomething() {
        return something;
    }

    public void add(int index, Something something) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Negative index!");
        }
        this.something[index] = something;
    }

    public void sort() {
        Arrays.sort(this.something, (firstSomething, secondSomething) -> {
            Integer firstWeight = firstSomething.getWeight();
            Integer secondWeight = secondSomething.getWeight();
            return firstWeight.compareTo(secondWeight);
        });
    }

    public int getElSystemPower() {
        int pow = 0;
        for (Something something : this.something) {
            pow += something.getPower();
        }
        return pow;
    }

    public Something[] findSomethingByWeight(int min, int max) {
        int n = 0;
        for (Something something : this.something) {
            int weight = something.getWeight();
            if (weight >= min && weight <= max) {
                n++;
            }
        }

        int i = 0;
        Something[] result = new Something[n];
        for (Something something : this.something) {
            int weight = something.getWeight();
            if (weight >= min && weight <= max) {
                result[++i] = something;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "[Object] ElSystem";
    }
}