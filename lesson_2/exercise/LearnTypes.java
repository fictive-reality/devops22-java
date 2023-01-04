package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(2.0f);
        answer.isInteger(2);

        byte any_byte = 0b0010;
        answer.isByte(any_byte);

        short any_short = 2;
        answer.isShort(any_short);
        double a_double = 3;
        answer.isDouble(a_double);

        answer.isLong(5L);

        answer.isChar('A');

        answer.isBoolean(false);
    }
}