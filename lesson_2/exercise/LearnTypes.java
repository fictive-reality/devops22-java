package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;


class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();
        answer.isString("hello world");
        answer.isFloat(0.5f);
        answer.isInteger(8);

        byte any_byte = 0b001;
        answer.isByte(any_byte);

        short any_short = 120;
        answer.isShort(any_short);

        answer.isDouble(3.555);
        answer.isLong(321l);
        answer.isChar('c');
        answer.isBoolean(false);
    }
}