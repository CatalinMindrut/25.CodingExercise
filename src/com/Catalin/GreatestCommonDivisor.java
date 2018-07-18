package com.Catalin;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(24, 12));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int commonDivisor = 1;
        int min = first < second ? first : second;
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0){
                System.out.println(i);
                commonDivisor = i;
                /** So the first part makes sense, the commonDivisor variable is defined.
                 * Then, according to the hint, you should find the smaller of the two numbers.
                 * This is accomplished by using a ?: conditional operator. if first is smaller than second
                 * then first, else second.
                 *
                 * Then you create a loop, making sure that the condition is that i is less or equal
                 * with the smallest number found previously.
                 * This means that i will always be equal to the number at most.
                 * For example if the number is 12, i will always be 12 at most, meaning that 12 can
                 * be divided by itself with no reminder. Having an i bigger then the smallest number is
                 * redundant since the division will no longer result in a positive number.
                 *
                 * Then the last part, the if statement, needs a bit more logic. So, the loop will always
                 * run the same number, i, for both variables at the same time.
                 * For example i = 2. The loop will verify that, as long as i is smaller than the smallest variable,
                 * the reminder of first and 2 is 0 and the reminder of second and 2 is 0.
                 * When this condition is met, and both reminders are 0, the variable is stored: commonDivisor = i;
                 * Normally you would think that the result will always be the first common divisor, not the biggest but
                 * this is not the case since the loop will not break and run continuously until the condition is met.
                 * This means that the last run of the loop will return the biggest divisor for the smallest number, if
                 * that divisor is also applicable to the second number.
                 *
                 * Rundown of the loop assuming the 12 and 24 as the numbers:
                 * for (int i = 1; i <= 12; i++) {
                 *             if (12 % 1 == 0 && 24 % 1 == 0){ This is true so:
                 *                 commonDivisor = 1;
                 *
                 * for (int i = 1; i <= 12; i++) {
                 *      if (12 % 2 == 0 && 24 % 2 == 0){ This is true so:
                 *          commonDivisor = 2;
                 * The commonDivisor will be re-written until the loop is done.
                 * for (int i = 1; i <= 12; i++) {
                 *      if (12 % 3 == 0 && 24 % 3 == 0){ This is true so:
                 *          commonDivisor = 3;
                 * for (int i = 1; i <= 12; i++) {
                 *      if (12 % 4 == 0 && 24 % 4 == 0){ This is true so:
                 *          commonDivisor = 4;
                 * for (int i = 1; i <= 12; i++) {
                 *      if (12 % 5 == 0 && 24 % 5 == 0){ This is NOT true so:
                 *          commonDivisor = 4; Remains 4.
                 * And so on until the loop ends. For example the last two runs of the loop:
                 *
                 * for (int i = 1; i <= 12; i++) {
                 *      if (12 % 11 == 0 && 24 % 11 == 0){ This is NOT true so:
                 *          commonDivisor = 6; Remains at 6, the last commonDivisor found by the loop.
                 * for (int i = 1; i <= 12; i++) {
                 *      if (12 % 12 == 0 && 24 % 12 == 0){ This is true so:
                 *          commonDivisor = 12;
                 * Common Divisor is re-writen to 12 and the loop stops since the condition is met 12 <= 12.
                 * The code will return the last saved value of commonDivisor, value saved when both the loop
                 * condition and the if conditions were met.
                 */
            }
        }
        return commonDivisor;
    }
}
