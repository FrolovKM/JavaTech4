package com.epam.konstantin_frolov.java.lesson4.task1.interfaces;

import com.epam.konstantin_frolov.java.lesson4.task1.models.Something;

public interface ESystem {
    public void add(int index, Something something);

    public void sort();

    public int getElSystemPower();

    public Something[] findSomethingByWeight(int min, int max);
}