package exercise;

import exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(9.9f);
        answer.isInteger(9);

        byte any_byte = 9;
        answer.isByte(any_byte);

        short any_short = 999;
        answer.isShort(any_short);

        answer.isDouble(9.9d);
        answer.isLong(99999999l);
        answer.isChar('w');
        answer.isBoolean(false);
    }
}