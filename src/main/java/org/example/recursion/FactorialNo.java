package org.example.recursion;

public class FactorialNo {

    int printFactorialNo(int n){
        if( n ==1 || n ==0 )
           return n;

        int fact_nm = printFactorialNo(n-1);
        int fact_n = n * fact_nm;


        return fact_n;

    }



    public static void main(String[] args) {
        FactorialNo f = new FactorialNo();
        System.out.println(f.printFactorialNo(5));

    }
}
