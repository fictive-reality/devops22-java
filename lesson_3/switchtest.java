import java.util.Scanner;

public class switchtest {

    public static void monthlySeasons(String months) {

        switch (months) {
            case "January":
                System.out.println("the Season in January is Winter");
                break;

            case "February":
                System.out.println("the Season in February is Winter");
                break;

            case "Mars":
                System.out.println("the Season in Mars is Winter/Spring");
                break;

            case "April":
                System.out.println("the Season in April is Spring");
                break;

            case "May":
                System.out.println("the Season in May is Spring");
                break;

            case "June":
                System.out.println("the Season in June is Spring/Summer");
                break;

            case "July":
                System.out.println("the Season in July is Summer");
                break;

            case "August":
                System.out.println("the Season in August is Summer");
                break;

            case "September":
                System.out.println("the Season in September is Summer/Autumn");
                break;

            case "October":
                System.out.println("the Season in October is Autumn");
                break;

            case "November":
                System.out.println("the Season in November is Autumn");
                break;

            case "December":
                System.out.println("the Season in December is Winter");
                break;

            default:
                System.out.println("Unknown expression, Please type a correct month.");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;
        System.out.printf("Enter a month to check its Season: ");
        input = sc.nextLine();
        input = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        switchtest.monthlySeasons(input);
    }

}
