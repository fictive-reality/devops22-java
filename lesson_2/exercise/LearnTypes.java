package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(88.5f);
        answer.isInteger(10);

        byte any_byte = 100;
        answer.isByte(any_byte);

        short any_short = 10000;
        answer.isShort(any_short);

        answer.isDouble(127.6d);
        answer.isLong(64L);
        answer.isChar('\u2661');
        answer.isBoolean(true);
    }
}