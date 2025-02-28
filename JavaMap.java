import java.util.*;

public class JavaMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Long> phoneBook = new HashMap<>();

        int line = sc.nextInt();
        sc.nextLine();
        while (line-- > 0) {

            String name = sc.nextLine();
            Long phoneNumber = sc.nextLong();
            sc.nextLine();
            phoneBook.put(name, phoneNumber);

        }

        while (sc.hasNext()) {
            String name = sc.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
