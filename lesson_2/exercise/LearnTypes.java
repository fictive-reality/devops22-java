package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(3.4e38f);
        answer.isInteger(2147483647);

        byte any_byte = 1;
        answer.isByte(any_byte);

        short any_short = -32768;
        answer.isShort(any_short);

        answer.isDouble(1.1);
        answer.isLong(1L);
        answer.isChar('A');
        answer.isBoolean(true);
    }
}