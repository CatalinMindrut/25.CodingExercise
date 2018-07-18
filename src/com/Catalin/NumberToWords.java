package com.Catalin;

public class NumberToWords {
    public static void main(String[] args) {

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int digitsNumber = getDigitCount(number);
        int digitReverse = getDigitCount(reversedNumber);
        int lastDigit;
        while (reversedNumber != 0) {
            lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
        for (int i = digitReverse; i < digitsNumber; i++) {
            System.out.println("Zero");
        }
    }
    public static int reverse(int number) {
        int reverseNumber = 0;
        int lastDigit;

        while (number != 0) {
            lastDigit = number % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
