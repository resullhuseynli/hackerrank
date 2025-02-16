import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        while (scanner.hasNext()) {

            String text = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d\n", text, number);

        }

        System.out.println("================================");

        scanner.close();

    }
}

