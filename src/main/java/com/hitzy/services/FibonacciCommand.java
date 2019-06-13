package com.hitzy.services;

public class FibonacciCommand implements Command {

    private PrintNumbers printNumbers;

    public FibonacciCommand(PrintNumbers printNumbers){
        this.printNumbers= printNumbers;
    }
    public void execute() {
        try {
            System.out.println("-- executing fibonacci command --");
            int[] fibNum = printNumbers.firstFibonacci();
            for(int i = 0; i < fibNum.length; i++){
                System.out.print(fibNum[i]+" ");
            }
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
