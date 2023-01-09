import java.util.Scanner;

public class switch_case {
    void continent(String country) {
        switch (country) {
            case "sweden":
            case "norway":
            case "finland":
            case "denmark":
            case "germany":
            case "france":
            case "spain": {
                System.out.println("This country is in Europe.");
                break;
            }
            case "china":
            case "thailand":
            case "lebanon":
            case "japan":
            case "south korea":
            case "india":
            case "pakistan": {
                System.out.println("This country is in Asia.");
                break;
            }
            default: {
                System.out.println("This country is in other continents");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {;
        System.out.print("Enter your country: ");
        String country = input.nextLine();
        switch_case continent_check = new switch_case();
        continent_check.continent(country);
        }
    }

}
