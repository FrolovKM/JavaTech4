package com.epam.konstantin_frolov.java.lesson4.task1.models;

import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoPowerException;
import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoWeightException;

public class SmallTech extends Something{
    public enum TypeSmallTech {
        VacuumCleaner,
        Iron,
    }

    private TypeSmallTech type = null;

    public SmallTech(Integer power, Integer weight, TypeSmallTech type) throws NoWeightException, NoPowerException{
        super(power, weight);
        this.type = type;
    }

    public TypeSmallTech getType() {
        return type;
    }

    public void setType(TypeSmallTech type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[Object] SmallTech";
    }
}
