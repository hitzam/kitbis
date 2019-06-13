package com.hitzy.services;

public class PrintNumbers {
    private int n;

    public PrintNumbers(int n) {
        this.n = n;
    }

    public int[] firstPrime() {
        int[] res = new int[n];
        int number = 2;
        int primeCount = 0;

        while (primeCount < n) {
            if (isPrime(number)) {
                //System.out.print(number + " ");
                res[primeCount] = number;
                primeCount++;
            }
            number++;
        }

        return res;
    }

    public int[] firstFibonacci() throws Exception {
        int[] res = new int[n];
        int a = 0, b = 0, c = 1;

        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            //System.out.print(a + " ");
            res[i] = a;
        }
        return res;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
