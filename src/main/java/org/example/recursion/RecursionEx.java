package org.example.recursion;

public class RecursionEx {


    public static void  print(int n){
        if(n == 0)
            return;
        System.out.println(n);
        print(n-1);


    }

    

    public static void main(String[] args) {
        RecursionEx r = new RecursionEx();
        int n = 5;
        r.print(n);

    }
}
