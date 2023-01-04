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
        answer.isMinimumFloat(Float.MIN_VALUE);
        answer.isMaximumFloat(Float.MAX_VALUE);

        // Find the double min/max in docs, navigate from the Float page
        answer.isMinimumDouble(Double.MIN_VALUE);
        answer.isMaximumDouble(Double.MAX_VALUE);

        // Find the byte min/max
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        answer.isMinimumByte(min);
        answer.isMaximumByte(max);

        // Find the short min/max
        short short_min = Short.MIN_VALUE;
        short short_max = Short.MAX_VALUE;
        answer.isMinimumShort(short_min);
        answer.isMaximumShort(short_max);

        // Find the long min/max
        // https://docs.oracle.com/javase/specs/jls/se17/html/jls-4.html#jls-4.2.1
        answer.isMinimumLong(Long.MIN_VALUE);
        answer.isMaximumLong(Long.MAX_VALUE);
    }
}