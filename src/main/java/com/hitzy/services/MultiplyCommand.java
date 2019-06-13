package com.hitzy.services;

public class MultiplyCommand implements Command {

    private Calculation calculation;

    public MultiplyCommand(Calculation calculation){
        this.calculation = calculation;
    }
    public void execute() {
        System.out.println("-- executing multiply command --");
        System.out.println(calculation.multiply());
    }
}
