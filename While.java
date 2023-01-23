
 import java.util.Scanner;

 public class While {
 
    public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Guess my age: ");
             String input = sc.nextLine();
             while (!"40".equalsIgnoreCase(input)) {
                 System.out.print("Guess again: ");
                 input = sc.nextLine();
                 System.out.println("That might be true :) ");
             }
         }
     }
 }
 