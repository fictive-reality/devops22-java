Clean workspace vid vscode problem under JAVA PROJECTS

Decimal system kallas för 'Base 10' (0-9). Hexadecimal 'Base 16', binary 'Base 2'.

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

ToBinaryString används när man använder t.ex. endast en bit/byte. Första biten säger om siffra är positiv eller negativ (0-positiv, 1-negativ). MAXVALUE och MINVALUE är 32 bitar långa. Short är halvint, long är dubbelt så stor som int.

Boolean
public class BooleanExample {

    public static void main(String[] args) {
        String empty = "";

        if (empty.equals("")) {
            System.out.println("success: empty.equals(\"\")");
        }

    }

}

Boolean tar en bit i minnet, 1 - True, 0 - False.
&& - and
|| - or

Doc string
/**
 * This function does something
 * @ param is
 * @return void
 *
 */
En standard på alla klasser, metoder.

// Single line comment

Python
val = 'not 1' if 0 else 'is 1'

\ inom apostrof om man vill ha citattecken, alt växla ' och ".

int hex_int = 0xff;
System.out.print(hex_int); hex_int == 255

Double tar dubbelt så mycket plats än float, mer detaljerade siffror.

Object a_object = null;
Object kan representera vad som helst

Skillnaden mellan liten och stor första bokstav 'boolean' eller 'Boolean'. 'Integer' hör till klassen medan 'integer' är primitiva typen. Klassen har då metoder till skillnad från primitiva typen. Oftast vill man ha små bokstäver när man vill spara siffra eller boolean.

parseInt = konvertera str till int

char är singel karaktär som kan ha endast singla citattecken.
char = 'A'
char = 'b'

Casting är vanlig i Java. Casta någon child class till parent class (arv och onjekt).
