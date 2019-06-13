package com.hitzy.services;

public class PrimeCommand implements Command {

    private PrintNumbers printNumbers;

    public PrimeCommand(PrintNumbers printNumbers){
        this.printNumbers= printNumbers;
    }
    public void execute() {
        System.out.println("-- executing prime command --");
        int[] primNum = printNumbers.firstPrime();
        for(int i = 0; i < primNum.length; i++){
            System.out.print(primNum[i]+" ");
        }
        System.out.println("");
    }
}
