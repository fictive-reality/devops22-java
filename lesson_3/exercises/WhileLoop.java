package exercises;

public class WhileLoop {
    int startnumber;

    public WhileLoop(int startnumber) {
        this.startnumber = startnumber;
    }

    public void whileBreak() {
        // Break loop if sum > 50
        int sum = this.startnumber;
        while (true) {
            if (sum > 50) {
                break;
            }

            System.out.println(sum);
            sum++;
        }
    }

    public void whileContinue() {
        // Do not print unlucky number

        int sum2 = this.startnumber;
        while (sum2 < 21) {
            if (sum2 == 13) {
                sum2++;
                continue;

            } else {
                System.out.println(sum2);
                sum2++;

            }
        }
    }

    public static void main(String[] args) {
        WhileLoop whileExample = new WhileLoop(1);
        System.out.print(whileExample);
        whileExample.whileBreak();
        whileExample.whileContinue();
    }
}