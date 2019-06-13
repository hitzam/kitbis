package com.hitzy;

import com.hitzy.services.*;

public class Main {

    public static void main(String[] args) {
        Calculation calculation = new Calculation(2,3);
        PrintNumbers printNumbers = new PrintNumbers(4);

        SumCommand sumCommand = new SumCommand(calculation);
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculation);

        PrimeCommand primeCommand = new PrimeCommand(printNumbers);
        FibonacciCommand fibonacciCommand = new FibonacciCommand(printNumbers);

        Executor executor = new Executor();
        executor.putCommand(sumCommand);
        executor.putCommand(multiplyCommand);
        executor.putCommand(primeCommand);
        executor.putCommand(fibonacciCommand);

        executor.executeCommand();

    }
}
