package com.hitzy.services;

public class SumCommand implements Command {

    private Calculation calculation;

    public SumCommand(Calculation calculation){
        this.calculation = calculation;
    }
    public void execute() {
        System.out.println("-- executing sum command --");
        System.out.println(calculation.sum());
    }
}
