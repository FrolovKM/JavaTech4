package com.epam.konstantin_frolov.java.lesson4.task1.models;

import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoPowerException;
import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoWeightException;

public class ComputerAndTV extends Something {
    public enum TypeComputerAndTV {
        Laptop,
        Computer,
        TV,
    }

    private TypeComputerAndTV type = null;

    public ComputerAndTV(Integer power, Integer weight, TypeComputerAndTV type) throws NoPowerException, NoWeightException {
        super(power, weight);
        this.type = type;
    }

    public void setType(TypeComputerAndTV type) {
        this.type = type;
    }

    public TypeComputerAndTV getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[Object] ComputerAndTV";
    }
}