package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(1.0f);
        answer.isInteger(1);

        byte any_byte = 1;
        answer.isByte(any_byte);

        short any_short = 1;
        answer.isShort(any_short);

        answer.isDouble(2.0d);
        answer.isLong(1L);
        answer.isChar('A');
        answer.isBoolean(true);
    }
}