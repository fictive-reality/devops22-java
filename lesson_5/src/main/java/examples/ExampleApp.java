package examples;

public class ExampleApp {

    int value = 10;

    public static void main(String[] args) {
    }

    public int getValue() {
        return this.value;
    }

    public void failingMethod() throws Exception {
        throw new Exception("failed");
    }

}
