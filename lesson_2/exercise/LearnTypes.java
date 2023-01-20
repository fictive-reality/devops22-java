package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(8.9f);
        answer.isInteger(4);

        byte any_byte = 0b001;
        answer.isByte(any_byte);

        short any_short = 124;
        answer.isShort(any_short);

        answer.isDouble(2.3343);
        answer.isLong(333l);
        answer.isChar('k');
        answer.isBoolean(false);
    }
}