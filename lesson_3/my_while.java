import java.util.Scanner;

public class my_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number, enter 0 to exit");
            int n = sc.nextInt();
            if (n <= 0)
            break;
            int sum = 0;
            int c = 1;
            while (c < n ){
                sum += c;
                c++;
            }
            System.out.println("Sum:" + sum);
        }
    }
    
}
