import java.util.Scanner;

public class circle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Circumference: " + circumference + " Area:" + area);
    }
}
