package com.hitzy.services;

public class Calculation {
    private double a;
    private double b;

    public Calculation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a + b;
    }

    public double multiply() {
        return a * b;
    }
}
