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
        answer.isMinimumFloat((float) Math.pow(2, (-149)));
        answer.isMaximumFloat((float) (2 - Math.pow(2, -23)) * (float) Math.pow(2, 127));
        // Find the double min/max in docs, navigate from the Float page
        answer.isMinimumDouble((double) Math.pow(2, (-1074)));
        answer.isMaximumDouble((double) (2 - Math.pow(2, -52)) * (double) Math.pow(2, 1023));

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