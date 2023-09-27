package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    private String fur;

    public Animal(String Color, int NumberOfPaws, boolean HasFur){
        color = Color;
        numberOfPaws = NumberOfPaws;
        hasFur = HasFur;
        fur = hasFur ? "a" : "no";
    }

    public String getDescription() {
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + fur + " fur.";
    }
}


