import java.util.Scanner;

public class My_Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = sc.nextLine();
        int days =  switch(month.toLowerCase()){
            case "april", "june", "september", "november" -> 30;
            case "january", "march", "may", "july", "august", "october", "december" -> 31;
            case "february" -> 28;
            default -> { System.out.println("Enter a month in english");
                        yield 0;
            }
        };
        System.out.println(days);
    }
}