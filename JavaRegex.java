import java.util.*;

class MyRegex {

    String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}

public class JavaRegex {
    public static void main(String[] args) {

        MyRegex regex = new MyRegex();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            System.out.println(ip.matches(regex.pattern));
        }
    }
}

