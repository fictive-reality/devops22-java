import java.util.Scanner;
import java.lang.Math;



public class circleinfo {
    int rad;

    public circleinfo(int rad) {
        this.rad = rad;
    }
     double area() {
        return Math.PI * Math.pow(rad, 2);
    }
    double circumference() {
        return 2 * Math.PI * rad;
    }
    public static void main(String[] args) {
        circleinfo circleinfo = new circleinfo(5);
        System.out.println("Area of this circle is: " + circleinfo.area());
        System.out.println("Circumference of this circle is: " + circleinfo.circumference());
    }
}
