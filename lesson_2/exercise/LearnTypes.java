package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(4.0f);
        answer.isInteger(2);

        byte any_byte = 0b0111;
        answer.isByte(any_byte);

        short any_short = 10;
        answer.isShort(any_short);

        answer.isDouble(1.7);
        answer.isLong(555L);
        answer.isChar('c');
        answer.isBoolean(true);
    }
}