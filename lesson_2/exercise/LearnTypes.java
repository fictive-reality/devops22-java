package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(0.0f);
        answer.isInteger(0);

        byte any_byte = 0;
        answer.isByte(any_byte);

        short any_short = 0;
        answer.isShort(any_short);

        answer.isDouble(0.0d);
        answer.isLong(0L);
        answer.isChar('\0');
        answer.isBoolean(false);
    }
}