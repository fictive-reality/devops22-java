public class whileloopcontinue {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
            if (i == 5 || i == 8) {
                continue;
            }

            System.out.println("|");
        }

    }
}
