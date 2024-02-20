package org.example.recursion;

public class FibonacciEx {

    public static void printFib(int a,int b, int n){

        if(n == 0)
            return;
        int c = a+ b;
        System.out.println(c);

        printFib(b, c , n-1);

    }

    public static void main(String[] args) {
        FibonacciEx f = new FibonacciEx();
        int a = 0;
        int b = 1;

        int n = 7;

        printFib(a, b ,n - 2);

    }
}
