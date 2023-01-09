public class While {
    public static void main(String[] args) throws InterruptedException {
        int timer = 60;

        while (timer > 0) {
            Thread.sleep(100);
            int x = 1;
            int seconds = x++;
            System.out.printf("Counting: %d\n", seconds);
            if (seconds >= timer) {
                System.out.printf("The timer has stoped. ");
                break;
            }
            timer -= seconds;
            System.out.printf("Total seconds remaining %d\n", timer);
        }
        System.out.println("1 Minute passed by!");

    }
}