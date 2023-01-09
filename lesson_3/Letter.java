public class Letter {

    static boolean isVowel(char c) {
        boolean answer = false;
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                answer = true;
                break;

            default:
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        isVowel('o');
    }
}
