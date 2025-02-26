import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = new ArrayList<>();
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            myList.add(scanner.nextInt());
        }

        int querySize = scanner.nextInt();

        while (querySize-- > 0) {
            String operation = scanner.next();

            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int number = scanner.nextInt();

                if (index == myList.size()) {
                    myList.add(number);
                } else if (index >= 0 && index < myList.size()) {
                    myList.add(index, number);
                }

            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();

                if (index >= 0 && index < myList.size()) {
                    myList.remove(index);
                }
            }
        }

        for (int num : myList) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
