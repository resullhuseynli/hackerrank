import java.util.*;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {

        String REGEX_USER_NAME = "^[a-zA-Z]\\w{7,29}$";
        Scanner in = new Scanner(System.in);
        int numTests = Integer.parseInt(in.nextLine());

        while (numTests-- > 0) {
            String username = in.nextLine();
            System.out.println(username.matches(REGEX_USER_NAME) ? "Valid" : "Invalid");
        }
        in.close();

    }
}
