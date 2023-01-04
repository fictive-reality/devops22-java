package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnTypesMinMax {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Find the min/max values in docs
        // https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-IntegerLiteral
        answer.isMaximumInteger(2147483647);
        answer.isMinimumInteger(0x8000_0000);

        // Find the floating-point literal in docs
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Float.html
        answer.isMinimumFloat(0x1.0P-149f);
        answer.isMaximumFloat(0x1.f_ffffeP+127f);

        // Find the double min/max in docs, navigate from the Float page
        answer.isMinimumDouble(0x1.0P-1074d);
        answer.isMaximumDouble(0x1.f_ffff_ffff_ffffP+1023d);

        // Find the byte min/max
        byte min = -0x80;
        byte max = 0x7f;
        answer.isMinimumByte(min);
        answer.isMaximumByte(max);

        // Find the short min/max
        short short_min = -0x8000;
        short short_max = 0x7fff;
        answer.isMinimumShort(short_min);
        answer.isMaximumShort(short_max);

        // Find the long min/max
        // https://docs.oracle.com/javase/specs/jls/se17/html/jls-4.html#jls-4.2.1
        answer.isMinimumLong(-0x8000_0000_0000_0000L);
        answer.isMaximumLong(0x7fff_ffff_ffff_ffffL);
    }
}