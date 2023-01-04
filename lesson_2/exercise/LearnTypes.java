package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(0.5f);
        answer.isInteger(5);

        byte any_byte = 5;
        answer.isByte(any_byte);

        short any_short = 1000;
        answer.isShort(any_short);

        answer.isDouble(0.5d);
        answer.isLong(5L);
        answer.isChar('\uFFFF');
        answer.isBoolean(false);
    }
}