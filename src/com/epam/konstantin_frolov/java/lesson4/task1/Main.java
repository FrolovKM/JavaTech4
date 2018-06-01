package com.epam.konstantin_frolov.java.lesson4.task1;

import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoPowerException;
import com.epam.konstantin_frolov.java.lesson4.task1.exceptions.NoWeightException;
import com.epam.konstantin_frolov.java.lesson4.task1.models.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int noPower = 0, power = 100;
        int noWeight = -10, weight = 10;

        Kitchen kitchen = null;
        try {
            kitchen = new Kitchen(noPower, weight, Kitchen.TypeKitchen.Owen);
        } catch (NoPowerException | NoWeightException e) {
            System.out.println("Kitchen: " + e.getMessage());
        }

        ComputerAndTV computerAndTV = null;
        try {
            computerAndTV = new ComputerAndTV(power, noWeight, ComputerAndTV.TypeComputerAndTV.TV);
        } catch (NoPowerException | NoWeightException e) {
            System.out.println("ComputerAndTV: " + e.getMessage());
        }

        SmallTech smallTech = null;
        try {
            smallTech = new SmallTech(power, noWeight, SmallTech.TypeSmallTech.Iron);
        } catch (NoPowerException | NoWeightException e) {
            System.out.println("SmallTech: " + e.getMessage());
        }

        ElSystem elSystem = null;
        try {
            elSystem = new ElSystem(0);
        } catch (Exception e) {
            System.out.println("ElSystem: " + e.getMessage());
        }

        elSystem = new ElSystem(3);

        if (elSystem != null) {
            System.out.println("System created");

            int i = 0;
            if (smallTech != null) {
                System.out.println("smallTech found");
                elSystem.add(++i, smallTech);
            } else {
                System.out.println("smallTech not found");
            }

            if (kitchen != null) {
                System.out.println("kitchen found");
                elSystem.add(++i, kitchen);
            } else {
                System.out.println("kitchen not found");
            }

            if (computerAndTV != null) {
                System.out.println("computerandtv found");
                elSystem.add(++i, computerAndTV);
            } else {
                System.out.println("computerandtv not found");
            }
        } else {
            System.out.println("elsystem ton found");
        }
    }
}