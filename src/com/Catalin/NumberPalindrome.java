package com.Catalin;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(245));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;
        while(num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            num = num / 10;
            if(number == reverse){
                return true;
            }
        }
        return false;
    }
    /**Zer logic:
     * First of all you need a variable that will store the reversed number, so you declared it in
     * the beginning "int reverse = 0".
     *
     * Then you will have to check if the reverse variable is equal with your actual number. But this
     * "number" variable will suffer modifications in the loop so the value will change, thus the
     * comparison will no longer be valid. To fix this, you will create another variable that will
     * initially store the value of your number "int num = number;".
     *
     * Now you must create a loop that will extract each digit of the number and store them in reverse order.
     * The condition of the loop will be that num has to be different from 0 and stop if it is. (this will
     * make sense later on when the loop functions are explained).
     *
     * The first line of the loop is "int lastDigit = num % 10". To start explaining this lets use the above example,
     * where the number is 245.
     * We created a new variable inside the loop "lastDigit" that will store the last digit of "num". The last
     * digit is extracted with the help of the reminder operator "%". For example 245 % 10 = 5. The number, 245 is
     * divided by 10 and the result is 24,5. The remainder of this operation is the digit located after the comma, thus
     * the result is 5. lastDigit = 5. So now we have the last digit of the number stored.
     *
     * The second line of the loop "reverse = reverse * 10;" will be explained later on.
     *
     * The third line of the loop "reverse = reverse + lastDigit;" add the extracted digit to the reverse variable,
     * in order to recreate the reversed number. In the first run of the loop, the digit is 5 and reverse is 0 so
     * reverse = reverse + lastDigit means reverse = 0 + 5 so reverse = 5.
     *
     * Now to explain the second line. If the loop runs a second time (reverse is now equal to 5) the second extracted digit
     * will be 4. If we only execute the 3rd line, ignoring the second one, the result will be reverse = reverse + lastDigit
     * so reverse = 5(value was set in the first run of the loop) + 4 (the new value of the lastDigit variable).
     * This will result in reverse = 9 which will not help at all, this will return in the end the sum of all digits, not
     * the reversed number.
     * In order to fix this we have to create another space for the each new digit so the second line of the loop is used.
     * Now, the first line will return the lastDigit which is 4 and the second line will multiply the reverse by 10 resulting in
     * reverse = 5 (value from the first run of the loop) * 10 so reverse = 50.
     * Now if the 3rd line is processed, the result will be reverse = reverse + lastDigit so reverse = 50 + 4 so reverse = 54
     * not 9 as before.
     *
     * The 4th line. If this line is not processed, the loop will just extract the same digit over and over again.
     * The result of the first line will be 5, the last digit of 245, every time.
     * To fix this, we need to get rid of the last digit of the number, because we already extracted it.
     * This can be done by dividing the num by 10. 245 / 10 = 24.5 but since num was declared as an integer, the digit after
     * the comma is ignored so 245 / 10 = 24. Now 24 is the new "num" that needs to be processed, extracting the last digit
     * and so on.
     *
     * The 3rd run of the loop will have the num = 2, the last digit will be extracted, which is 2, the reverse will be
     * already multiplied by 10 and the 2 will be added to 540, resulting in 542, the exact reverse of 245.
     *
     * The last part of the loop is an if statement that verifies that the reverse variable (542) is equal to the original
     * number (245). If we used the "number" variable in the loop, instead of "num", the if statement would have verified
     * the last iteration of the number, which would have been the result of the last looped number = number /10.
     * In our example this would have been number = 2 / 10 so number = 0.2 but number is an integer so number = 0.
     * The if statement would always be false.
     */
}
