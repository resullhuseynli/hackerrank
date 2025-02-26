import java.io.*;
import java.util.*;


public class Java1DArray {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in) ;

        int number = scanner.nextInt() ;
        int[] numberArray = new int[number] ;

        for (int i=0 ; i<number ; i++) {

            int num = scanner.nextInt() ;
            numberArray[i] = num;

        }

        for (int result : numberArray) {
            System.out.println(result);
        }
        scanner.close() ;
    }
}
