package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnDefaults {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        answer.trueOrThrow(LearnJavaHelpers.a_byte == 0);
        answer.trueOrThrow(LearnJavaHelpers.a_short == 0);
        answer.trueOrThrow(LearnJavaHelpers.a_int == 0);
        answer.trueOrThrow(LearnJavaHelpers.a_long == 0L);
        answer.trueOrThrow(LearnJavaHelpers.a_float == 0f);
        answer.trueOrThrow(LearnJavaHelpers.a_double == 0d);
        answer.trueOrThrow(LearnJavaHelpers.a_char == '\u0000');
        answer.trueOrThrow(LearnJavaHelpers.a_string == null);
        answer.trueOrThrow(LearnJavaHelpers.a_boolean == false);
    }
}
