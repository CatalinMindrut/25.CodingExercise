package com.Catalin;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(234));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = number % 10;
        int reverse = 0;
        int lastDigit = 0;
        while(number > 0){
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number /10;
        }
        return sum + (reverse % 10);
    }

}
