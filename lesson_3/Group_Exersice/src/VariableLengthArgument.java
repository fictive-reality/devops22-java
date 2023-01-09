public class VariableLengthArgument {

    static String chars(String... terms) {
        String chars = "";
        for (String term : terms) {
            chars += term;
        }
        return chars;
    }

    public static void main(String[] args) {
        System.out.println(chars("A", "B", "C", "D", "F"));
    }
}