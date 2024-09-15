import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input your name: ");
        String num = scan.next();

        System.out.printf("Hello %s!", num);
        scan.close();
    }
}