package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnDefaults {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Find the default values in java tutorial or the java language specification
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        // https://docs.oracle.com/javase/specs/jls/se11/html/jls-4.html#jls-4.12.5

        // What are the default value for these types?
        answer.trueOrThrow(LearnJavaHelpers.a_byte == 0);
        answer.trueOrThrow(LearnJavaHelpers.a_short == 0);
        answer.trueOrThrow(LearnJavaHelpers.a_int == 0);
        answer.trueOrThrow(LearnJavaHelpers.a_long == 0L);
        answer.trueOrThrow(LearnJavaHelpers.a_float == 0.0f);
        answer.trueOrThrow(LearnJavaHelpers.a_double == 0.0d);
        answer.trueOrThrow(LearnJavaHelpers.a_char == '\u0000');
        answer.trueOrThrow(LearnJavaHelpers.a_string == null);
        answer.trueOrThrow(LearnJavaHelpers.a_boolean == false);
    }
}
