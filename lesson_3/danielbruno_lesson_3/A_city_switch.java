package danielbruno_lesson_3;

import java.util.Scanner;

public class A_city_switch {

    // Individual exercise: Write a switch case

    void cityCountry(String city) {
        switch (city) {
            case "stockholm":
            case "Stockholm":
            case "göteborg":
            case "Göteborg":
            case "malmö":
            case "Malmö": {
                System.out.println("Sweden");
                break;
            }
            case "mexico city":
            case "Mexico city":
            case "acapulco":
            case "Acapulco":
            case "cancun":
            case "Cancun": {
                System.out.println("Mexico");
                break;
            }
            case "osaka":
            case "Osaka":
            case "tokyo":
            case "Tokyo":
            case "kyoto":
            case "Kyoto": {
                System.out.println("Japan");
                break;
            }
            case "lima":
            case "Lima":
            case "cusco":
            case "Cusco":
            case "arequipa":
            case "Arequipa":
            case "trujillo":
            case "Trujillo": {
                System.out.println("Peru");
                break;
            }
            case "paris":
            case "Paris":
            case "lille":
            case "Lille":
            case "nice":
            case "Nice":
            case "lyon":
            case "Lyon":
            case "bordeaux":
            case "Bordeaux": {
                System.out.println("France");
                break;
            }
            default: {
                System.out.println("Undefined country");
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a city and get the country:");
            String city = sc.nextLine();
            A_city_switch citySwitch = new A_city_switch();
            citySwitch.cityCountry(city);
        }
    }
}
