package org.example.recursion;

public class PrintNaturalNo {

    void printSumOfNaturalNo(int i, int n, int sum){
        if(i == n){
            sum += i ;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSumOfNaturalNo(i+1, n , sum);


    }

    public static void main(String[] args) {
        PrintNaturalNo p = new PrintNaturalNo();

        p.printSumOfNaturalNo(1,100,0);

    }
}
