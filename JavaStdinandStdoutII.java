import java.util.Scanner;

public class JavaStdinandStdoutII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int intNumber = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();

        scanner.nextLine();

        String text = scanner.nextLine();

        scanner.close();

        System.out.printf("String: %s \n", text);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + intNumber);

    }
}