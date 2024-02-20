package org.example.recursion;

public class Recursion1 {

    void print(int n){

        if(n == 6)
            return ;
        System.out.println(n);
        print(n+1);

    }
    public static void main(String[] args) {
        Recursion1 r = new Recursion1();
        int n = 1;
        r.print(n);

    }
}
