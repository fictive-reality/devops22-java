package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnHexadecimal {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        answer.isIntegerWithHex(0, "0x0");
        answer.isIntegerWithHex(1, "0x1");
        answer.isIntegerWithHex(8, "0x8");
        answer.isIntegerWithHex(10, "0xa");
        answer.isIntegerWithHex(11, "0xb");
        answer.isIntegerWithHex(15, "0xf");
        answer.isIntegerWithHex(16, "0x10");
        answer.isIntegerWithHex(17, "0x11");
        answer.isIntegerWithHex(25, "0x19");
        answer.isIntegerWithHex(26, "0x1a");
        answer.isIntegerWithHex(100, "0x64");
        answer.isIntegerWithHex(255, "0xff");
        answer.isIntegerWithHex(256, "0x100");
        answer.isIntegerWithHex(512, "0x200");
    }
}