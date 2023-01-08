package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(2.2f);
        answer.isInteger(3);

        byte any_byte = 127;
        answer.isByte(any_byte);

        short any_short = 10;
        answer.isShort(any_short);

        answer.isDouble(1.0);
        answer.isLong(1L);
        answer.isChar('T');
        answer.isBoolean(true);
    }
}