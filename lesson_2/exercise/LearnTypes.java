package lesson_2.exercise;

class LearnTypes {
    public static void main(String[] args) {
       // LearnJavaHelpers answer = new LearnJavaHelpers();
        answer.isString("hello world");
        answer.isFloat(0.5);
        answer.isInteger(81);

        byte any_byte = 90;
        answer.isByte(any_byte);

        short any_short = 20;
        answer.isShort(any_short);

        answer.isDouble(1.5);
        answer.isLong(321L);
        answer.isChar("c");
        answer.isBoolean(false);
    }
}