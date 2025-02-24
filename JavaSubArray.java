import java.util.*;

public class JavaSubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        List<Integer> myNumbList = new ArrayList<>();

        int n = scanner.nextInt();
        int count = 0;
        while (count<n) {
            int number = scanner.nextInt();
            myNumbList.add(number) ;
            count++;
        }

        scanner.close();

        count = 0;

        for (int begin=0 ; begin<myNumbList.size() ; begin++) {

            int sumOfNumbers = 0;

            for (int last = begin ; last<myNumbList.size() ; last++) {

                sumOfNumbers += myNumbList.get(last) ;

                if (sumOfNumbers<0) {
                    count++;
                }

            }
        }

        System.out.println(count);

    }
}
