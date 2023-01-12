

//Whileloop with break

class WhileLoop {

    public static void main(String[] args) {
        int n = 1;

        while (n <= 10) {
            System.out.println("*");
            if (n == 6) {
                break;
            }
            n++;
        }
    }
}
