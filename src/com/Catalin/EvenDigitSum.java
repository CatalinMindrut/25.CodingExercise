package com.Catalin;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(234));

    }
    public static int getEvenDigitSum(int number){
        if(number <= 0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
           int digit = number % 10;
            if(isEven(digit)){
                //May be replaced with "if((digit % 2) == 0)"
                sum = sum + digit;
            }
            number /= 10;
        }
        return sum;
    }
//if the number is even, add to sum, multiply by 10

    public static boolean isEven(int number){
        if((number % 2) == 0){
            return true;
        }
        return false;
    }
}
