package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypesMinMax {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Find the min/max values in docs
        // https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-IntegerLiteral
        answer.isMaximumInteger(2147483647);
        answer.isMinimumInteger(-2147483648);

        // Find the floating-point literal in docs
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Float.html
        answer.isMinimumFloat(1.401298464324817E-45f);
        answer.isMaximumFloat(3.4028234663852886E38f);

        // Find the double min/max in docs, navigate from the Float page
        answer.isMinimumDouble(4.9E-324);
        answer.isMaximumDouble(1.7976931348623157E308);
        
        // Find the byte min/max
        byte min = -128;
        byte max = 127;
        answer.isMinimumByte(min);
        answer.isMaximumByte(max);

        // Find the short min/max
        short short_min = -32768;
        short short_max = 32767;
        answer.isMinimumShort(short_min);
        answer.isMaximumShort(short_max);

        // Find the long min/max
        // https://docs.oracle.com/javase/specs/jls/se17/html/jls-4.html#jls-4.2.1
        answer.isMinimumLong(-9223372036854775808L);
        answer.isMaximumLong(9223372036854775807L);
    }
}