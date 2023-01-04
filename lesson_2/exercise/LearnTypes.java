package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(0.1f);
        answer.isInteger(5);

        byte any_byte = 10;
        answer.isByte(any_byte);

        short any_short = 777;
        answer.isShort(any_short);

        answer.isDouble(1.2d);
        answer.isLong(10L);
        answer.isChar('\uffff');
        answer.isBoolean(false);
    }
}