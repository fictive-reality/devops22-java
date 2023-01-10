
import java.util.Scanner;

public class ExtraExercise {
    int number;
    float radius;

    public void calculate() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius: ");
            this.radius = sc.nextFloat();
            System.out.println("Enter 1: area, 2:circumference, 0:Exit ");
            this.number = sc.nextInt();
            // fungerar inte. vet inte varför.
            if (this.number > 0 && this.number < 100) {
                switch (this.number) {
                    case 1: {
                        float area = (float) (Math.PI * Math.pow(this.radius, 2));
                        System.out.println(area);
                        continue;
                    }
                    case 2: {
                        float circumference = (float) (2 * Math.PI * this.radius);
                        System.out.println(circumference);
                        continue;
                    }
                    default:
                        System.out.println("Not an option. ");
                }
            } else if (this.number < 0) {
                System.out.println(" guess a higher number ");
                continue;
            } else if (this.number == 0) {
                System.out.println("Exit ");
                break;
            } else {
                continue;
            }
        }

    }

    public static void main(String[] args) {
        ExtraExercise extraExercise = new ExtraExercise();
        extraExercise.calculate();
    }
}
