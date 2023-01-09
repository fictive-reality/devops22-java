public class Loop {
    public static void main(String[] args) {
        int x = 0;
        while (true) {
            System.out.println(x);
            x++;
            if (x > 10) {
                break;
            }
        }
        x = 0;
        while (x < 10) {
            x++;
            if (x % 2 == 0) {
                continue;
            }
            System.out.println(x);
        }
    }
}
