package com.epam.konstantin_frolov.java.lesson4.task1.models;

import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoPowerException;
import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoWeightException;

public class Kitchen extends Something {
    public enum TypeKitchen {
        Owen,
        Fridge,
    }

    private TypeKitchen type = null;

    public Kitchen(Integer power, Integer weight, TypeKitchen type) throws NoPowerException, NoWeightException{
        super(power, weight);
        this.type = type;
    }

    public void setType(TypeKitchen type) {
        this.type = type;
    }

    public TypeKitchen getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[Object] Kitchen";
    }
}