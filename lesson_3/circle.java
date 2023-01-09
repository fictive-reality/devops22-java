import java.util.scanner;

public class circle {

    public static void main(String[] args) {
        int radius = 2;
        calculate_circumference(radius);
        calculate_area(radius);
    }
    

    static void calculate_circumference(int radius) {
       double circumference = 3.14 * 3.14 * radius;
       System.out.println(circumference);
    }
    static void calculate_area(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}