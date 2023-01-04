package examples;

class EscapeExample {
    public static void main(String[] args) {
        String a_string_with_escape = "hello world with an escape character: \\";
        String a_string_with_apostrophe = "hello world with a apostrophe: '";
        String a_string_with_quote = "hello world with a quote: \"";
        System.out.println(a_string_with_escape);
        System.out.println(a_string_with_apostrophe);
        System.out.println(a_string_with_quote);
    }
}