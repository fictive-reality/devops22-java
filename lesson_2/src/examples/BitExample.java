package examples;

public class BitExample {
    public static void main(String[] args) {
        int ONE = 1;
        int TWO = 2;
        int EIGHT = 8;
        int TEN = 10;

        System.out.println(Integer.toBinaryString(ONE));
        System.out.println(Integer.toBinaryString(TWO));
        System.out.println(Integer.toBinaryString(EIGHT));
        System.out.println(Integer.toBinaryString(TEN));

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE).length());
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE).length());

        System.out.println(Long.toBinaryString(Long.MIN_VALUE).length());

        int binary_int = 0b0001;
        int full_binary_int = 0b1111;
        int another_binary_int = 0b0001_0000;
        System.out.println(binary_int);
        System.out.println(full_binary_int);
        System.out.println(another_binary_int);

    }

}
