import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What's your name, friend: ");
        String name = scan.nextLine();
        System.out.println("Nice to meet you, "+name);

        System.out.print("What's your favorite color: ");
        String color = scan.nextLine();
        System.out.println("My favorite color is also "+color);

        System.out.print("What is your favorite book: ");
        String book = scan.nextLine();
        System.out.println("Oh, I hate "+book);

        System.out.print("What is your favorite subject: ");
        String subject = scan.nextLine();
        System.out.println("I also love "+subject);

        System.out.print("What's your favorite programming language" );
        String lang = scan.nextLine();
        System.out.println("Both C and " +lang+ " suck.");

        scan.close();
    }
}
