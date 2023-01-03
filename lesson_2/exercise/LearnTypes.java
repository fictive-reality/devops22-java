package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(0.0f);
        answer.isInteger(1);

        byte any_byte = 1;
        answer.isByte(any_byte);

        short any_short = 32000;
        answer.isShort(any_short);

        answer.isDouble(0.0d);
        answer.isLong(0L);
        answer.isChar('\u0000');
        answer.isBoolean(true);
    }
}