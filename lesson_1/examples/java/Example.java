package lesson_1.examples.java;

class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator calc = new Calculator();
        calc.sum_range();
    }

    public int sum_range(int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
