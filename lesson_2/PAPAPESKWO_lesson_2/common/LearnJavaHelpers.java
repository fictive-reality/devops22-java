package lesson_2.exercise.common;

// DON'T MODIFY THIS FILE

public class LearnJavaHelpers {

    public void trueOrThrow(boolean bool) {
        if (!bool) {
            throw new AssertionError();
        }
    }

    public void isString(Object value) {
        this.trueOrThrow(String.class.isInstance(value));
        System.out.println(String.format("%s is a string", value));
    }

    public void isByte(Object value) {
        this.trueOrThrow(Byte.class.isInstance(value));
        System.out.println(String.format("%s is a byte", value));
    }

    public void isShort(Object value) {
        this.trueOrThrow(Short.class.isInstance(value));
        System.out.println(String.format("%s is a short", value));
    }

    public void isFloat(Object value) {
        this.trueOrThrow(Float.class.isInstance(value));
        System.out.println(String.format("%s is a float", value));
    }

    public void isDouble(Object value) {
        this.trueOrThrow(Double.class.isInstance(value));
        System.out.println(String.format("%s is a double", value));
    }

    public void isChar(Object value) {
        this.trueOrThrow(Character.class.isInstance(value));
        System.out.println(String.format("%s is a char", value));
    }

    public void isLong(Object value) {
        this.trueOrThrow(Long.class.isInstance(value));
        System.out.println(String.format("%s is a long", value));
    }

    public void isBoolean(Object value) {
        this.trueOrThrow(Boolean.class.isInstance(value));
        System.out.println(String.format("%s is a boolean", value));
    }

    public void isInteger(Object value) {
        this.trueOrThrow(Integer.class.isInstance(value));
        System.out.println(String.format("%s is a integer", value));
    }

    public void isMaximumInteger(Object value) {
        this.trueOrThrow(Integer.class.isInstance(value));
        this.trueOrThrow((int) value == Integer.MAX_VALUE);
        System.out.println(String.format("%s is a integer", value));
    }

    public void isMinimumInteger(Object value) {
        this.trueOrThrow(Integer.class.isInstance(value));
        this.trueOrThrow((int) value == Integer.MIN_VALUE);
        System.out.println(String.format("%s is a integer", value));
    }

    public void isMinimumFloat(Object value) {
        this.trueOrThrow(Float.class.isInstance(value));
        this.trueOrThrow((float) value == Float.MIN_VALUE);
        System.out.println(String.format("%s is a float", value));
    }

    public void isIntegerWithHex(Object value, String hex) {
        this.trueOrThrow(Integer.class.isInstance(value));
        this.trueOrThrow(hex.matches("^(0x|0X).*$"));
        int hexValue = Integer.decode(hex);
        this.trueOrThrow(Integer.class.isInstance(hexValue));
        System.out.printf("hexadecimal provided equals decimal: %s wanted: %d\n", hexValue, value);
        this.trueOrThrow((int) value == hexValue);
        System.out.println(String.format("%s is a integer with hex %s", value, hex));

    }

    public void isMaximumFloat(Object value) {
        this.trueOrThrow(Float.class.isInstance(value));
        this.trueOrThrow((float) value == Float.MAX_VALUE);
        System.out.println(String.format("%s is a float", value));
    }

    public void isMinimumDouble(Object value) {
        this.trueOrThrow(Double.class.isInstance(value));
        this.trueOrThrow((double) value == Double.MIN_VALUE);
        System.out.println(String.format("%s is a double", value));
    }

    public void isMaximumDouble(Object value) {
        this.trueOrThrow(Double.class.isInstance(value));
        this.trueOrThrow((double) value == Double.MAX_VALUE);
        System.out.println(String.format("%s is a double", value));
    }

    public void isMaximumByte(Object value) {
        this.trueOrThrow(Byte.class.isInstance(value));
        this.trueOrThrow((byte) value == Byte.MAX_VALUE);
        System.out.println(String.format("%s is a byte", value));
    }

    public void isMinimumByte(Object value) {
        this.trueOrThrow(Byte.class.isInstance(value));
        this.trueOrThrow((byte) value == Byte.MIN_VALUE);
        System.out.println(String.format("%s is a byte", value));
    }

    public void isMaximumShort(Object value) {
        this.trueOrThrow(Short.class.isInstance(value));
        this.trueOrThrow((short) value == Short.MAX_VALUE);
        System.out.println(String.format("%s is a short", value));
    }

    public void isMinimumShort(Object value) {
        this.trueOrThrow(Short.class.isInstance(value));
        this.trueOrThrow((short) value == Short.MIN_VALUE);
        System.out.println(String.format("%s is a short", value));
    }

    public void isMaximumLong(Object value) {
        this.trueOrThrow(Long.class.isInstance(value));
        this.trueOrThrow((long) value == Long.MAX_VALUE);
        System.out.println(String.format("%s is a long", value));
    }

    public void isMinimumLong(Object value) {
        this.trueOrThrow(Long.class.isInstance(value));
        this.trueOrThrow((long) value == Long.MIN_VALUE);
        System.out.println(String.format("%s is a long", value));
    }

    public static byte a_byte;
    public static short a_short;
    public static int a_int;
    public static long a_long;
    public static float a_float;
    public static double a_double;
    public static char a_char;
    public static String a_string;
    public static boolean a_boolean;
}