import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner .nextInt();

        scanner.close();

        String s =Integer.toString(number);

        if (number == Integer.parseInt(s)) {

            System.out.println("Good job");

        } else {

            System.out.println("Wrong answer.");

        }


    }

}
