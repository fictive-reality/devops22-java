import java.util.Scanner;

public class switchcountry {

    void language(String country) {
        switch (country) {
            case "italy":
            case "Italy": {
                System.out.println("Buona giornata");
                break;
            }
            case "spain":
            case "Spain": {
                System.out.println("Buen día");
                break;
            }
            case "france":
            case "France": {
                System.out.println("Bonne journée");
                break;
            }
            case "germany":
            case "Germany": {
                System.out.println("Guten tag");
                break;
            
            }
            default: {
                System.out.println("unknown language");
                break;
            }
        }
    }

    public static void main(String[] args) {
       
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter country: ");
            String country = sc.nextLine();
            switchcountry switchcountry = new switchcountry();
            switchcountry.language(country);
        }
    }

}
