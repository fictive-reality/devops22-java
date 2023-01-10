
import java.util.Scanner;

public class ExtraExercise {
    int number;
    float radius;

    public void response() {

        while (true) {
            // System.out.println("Enter radius: ");
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter radius: ");
                this.radius = sc.nextFloat();
                System.out.println("Enter 1: area, 2:circumference, 0:exit ");
                this.number = sc.nextInt();
            }

            switch (number) {
                case 0: {
                    System.out.println("Exit program. ");
                    break;
                }
                case 1: {
                    float area = (float) (Math.PI * Math.pow(this.radius, 2));
                    System.out.printf("area", area);
                    continue;
                }
                case 2: {
                    float circumference = (float) (2 * Math.PI * this.radius);
                    System.out.printf("circumference  \n", circumference);
                    continue;
                }
                default:
                    System.out.println("Not an option. ");

            }
        }
    }

    public static void main(String[] args) {
        ExtraExercise extraExercise = new ExtraExercise();
        extraExercise.response();
    }
}
