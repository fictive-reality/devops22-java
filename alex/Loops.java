package alex;

public class Loops {
     public static void main(String[] args) {
         int x = 0;
         while (true) {
             System.out.println(x);
             x++;
             if (x > 10) {
                 break; // Prints 0 to 10 and stops the loop when x is 11
             }
         }
         x = 0;
         while (x < 10) {
             x++;
             if (x % 2 == 1) {
                 continue; // Skips the odd numbers, continuing the loop after each odd number
             }
             System.out.println(x);
         }
     }
 }

