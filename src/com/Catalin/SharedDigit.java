package com.Catalin;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 54));

    }

    public static boolean hasSharedDigit(int start, int end){
        if((start < 10 || start > 99)||(end < 10 || end > 99)){
            return false;
        }
        int numOne = start, numTwo = end;

        numOne = start%10;
        start/=10;
        numTwo = end%10;
        end/=10;

        if (numOne == numTwo || numOne == end || numTwo == start){
            return true;
        }
        else return false;
    }
}
