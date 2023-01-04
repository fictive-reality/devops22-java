package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(1.11f);
        answer.isInteger(1001);

        byte any_byte = 126;
        answer.isByte(any_byte);

        short any_short = 30333;
        answer.isShort(any_short);

        answer.isDouble(3.45);
        answer.isLong(10001L);
        answer.isChar('\u0000');
        answer.isBoolean(true);
    }
}