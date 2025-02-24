import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int row = scanner.nextInt() ;
        int count1 = 0 ;

        List<List<Integer>> myList = new ArrayList<>() ;

        while (count1 < row) {

            int column = scanner.nextInt() ;
            int count2 = 0;
            count1++;
            List<Integer> myRows = new ArrayList<>();

            while(count2 < column) {

                int number = scanner.nextInt();
                myRows.add(number) ;
                count2++;

            }
            myList.add(myRows) ;
        }

        int attempt = scanner.nextInt();
        count1 = 0;

        while ( count1 < attempt ) {

            row = scanner.nextInt()-1;
            int column = scanner.nextInt()-1;
            count1++;

            try {
                int result = myList.get(row).get(column);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

        scanner.close() ;

    }
}