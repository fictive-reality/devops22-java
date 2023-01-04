package lesson_2.exercise;

import lesson_2.exercise.common.LearnJavaHelpers;

class LearnHexadecimal {
    public static void main(String[] args) {
        LearnJavaHelpers answer = new LearnJavaHelpers();

        // Hexadecimal
        // https://docs.oracle.com/javase/specs/jls/se11/html/jls-3.html#jls-HexNumeral
        // https://simple.wikipedia.org/wiki/Hexadecimal
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
        answer.isIntegerWithHex(100, "0x0064");
        answer.isIntegerWithHex(255, "0xff");
        answer.isIntegerWithHex(256, "0x100");
        answer.isIntegerWithHex(512, "0x200");

        // 0: 0b0000 -> 0x0
        // 1: 0b0001 -> 0x1
        // 2: 0b0010 -> 0x2
        // 3: 0b0011 -> 0x3
        // 4: 0b0100 -> 0x4
        // 5: 0b0101 -> 0x5
        // 6: 0b0110 -> 0x6
        // 7: 0b0111 -> 0x7
        // 8: 0b1000 -> 0x8
        // 9: 0b1001 -> 0x9
        // 10: 0b1010 -> 0xa
        // 11: 0b1011 -> 0xb
        // 12: 0b1100 -> 0xc
        // 13: 0b1101 -> 0xd
        // 14: 0b1110 -> 0xe
        // 15: 0b1111 -> 0xf

        // 0xff -> 0b1111_1111
        // 0x4a -> 0b0100_1010

        // Decimal converting
        // 0x11 would equal in decimal: 1 * 16^1 + 1 * 16^0
        // a way of thinking: 100 / 16 = 6.25 6*16 = 96 4
        // 100 -> 0x64 -> 0b0110_0100
    }
}