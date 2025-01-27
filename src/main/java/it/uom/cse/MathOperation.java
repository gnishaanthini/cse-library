package it.uom.cse;

import java.util.Arrays;



public class MathOperation {
    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }


    public static int factorial(int n) {
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumOfIntegers(int n){
        int total = 0;
        for(int i=0;i<=n;i++){
            total=total+i;
        }
        return total;
    }

    public static int fib(int n)
    {
            if (n <= 1) {
                return n;
            }
            return fib(n-1) + fib(n-2);


    }

    public static boolean checkprime(int n){
        int num = n;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if(!flag)
            return true;
        else
            return false;
    }

    public static int sum_of_primes(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(checkprime(i)){
                count+=i;
            }
        }
        return count;

    }




}


