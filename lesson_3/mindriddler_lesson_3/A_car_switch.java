package mindriddler_lesson_3;

import java.util.Scanner;

public class A_car_switch {

    void carCountry(String car) {
        switch (car) {
            case "BMW":
            case "bmw":
            case "Audi":
            case "audi":
            case "Mercedes":
            case "mercedes":
            case "Volkswagen":
            case "volkswagen": {
                System.out.println("Germany");
                break;
            }
            case "Toyota":
            case "toyota":
            case "Honda":
            case "honda":
            case "Mazda":
            case "mazda":
            case "Nissan":
            case "nissan": {
                System.out.println("Japan");
                break;
            }
            case "Ford":
            case "ford":
            case "Chevrolet":
            case "chevrolet":
            case "Dodge":
            case "dodge":
            case "Chrysler":
            case "chrysler": {
                System.out.println("USA");
                break;
            }
            case "Hyundai":
            case "hyundai":
            case "Kia":
            case "kia": {
                System.out.println("South Korea");
                break;
            }
            case "Renault":
            case "renault":
            case "Peugeot":
            case "peugeot":
            case "Citroen":
            case "citroen": {
                System.out.println("France");
                break;
            }
            case "Fiat":
            case "fiat":
            case "Alfa Romeo":
            case "alfa romeo":
            case "Lancia":
            case "lancia": {
                System.out.println("Italy");
                break;
            }
            case "Volvo":
            case "volvo":
            case "Saab":
            case "saab":
            case "Koenigsegg":
            case "koenigsegg": {
                System.out.println("Sweden");
                break;
            }
            case "Lada":
            case "lada": {
                System.out.println("Russia");
                break;
            }
            case "Skoda":
            case "skoda": {
                System.out.println("Czech Republic");
                break;
            }
            default: {
                System.out.println("Undefined country");
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a car brand and get the country of origin.");
            System.out.print(">> ");
            String car = sc.nextLine();
            A_car_switch carSwitch = new A_car_switch();
            carSwitch.carCountry(car);
        }
    }
}
