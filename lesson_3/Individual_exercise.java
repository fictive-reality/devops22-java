import java.util.Scanner;
public class Individual_exercise {

    // WHILE LOOP
        public static void main(String[] args) {
         int number = 100;
         int x = 1;
         while (x < 100) {
            x ++;
            System.out.println(x);
            if (x == number) {
                break;}
            
        }
        }
    }
    // Circle calculation

class Circle {
    int radius = 0;

    public static void Calc_Area_Circ(int radius) {
        double circumference = 3.14 * 3.14 * radius;
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}

    // Class with Switch

class Switch {
    void RightNumber(int values) {
        switch (values) {
            case 1:
            case 2: {
                System.out.print("correct");
                break;
            }

            default: {
                System.out.print("Not Correct.");
            }

        }
    }
}