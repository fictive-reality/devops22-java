package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypes {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Uncomment & fill in the missing values
        answer.isString("hello world");
        answer.isFloat(0.5f);
        answer.isInteger(1);
    
        byte any_byte = 100;
        answer.isByte(any_byte);
    
        short any_short = 5000;
        answer.isShort(any_short);
    
        answer.isDouble(19.99d);
        answer.isLong(15000000000L);
        answer.isChar('B');
        answer.isBoolean(true);
    }
}