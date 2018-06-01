package com.epam.konstantin_frolov.java.lesson4.task1.models;

import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoPowerException;
import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoWeightException;

public class Something {
    private Integer power = null;
    private Integer weight = null;

    public Something(Integer power, Integer weight) throws NoPowerException, NoWeightException {
        if (power < 0) {
            throw new NoPowerException("Power is not exist");
        }
        if (weight < 0) {
            throw new NoWeightException("Weight is negative!");
        }
        this.power = power;
        this.weight = weight;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[Object] Something";
    }
}