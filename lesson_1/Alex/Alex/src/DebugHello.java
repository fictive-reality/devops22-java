public class DebugHello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DebugHello example = new DebugHello();
        example.sum_range();
    }

    public void sum_range() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
