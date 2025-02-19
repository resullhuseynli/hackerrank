import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {

            String pattern = scanner.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");

            }
        }
    }
}



