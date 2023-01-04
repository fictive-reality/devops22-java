package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(1.0f);
        answer.isInteger(10);

        byte any_byte = 1;
        answer.isByte(any_byte);

        short any_short = 2;
        answer.isShort(any_short);

        answer.isDouble(1.0d);
        answer.isLong(10L);
        answer.isChar('D');
        answer.isBoolean(true);
    }
}