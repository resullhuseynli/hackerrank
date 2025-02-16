import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int q = scanner.nextInt();
        int loop = 0;

        while (loop<q) {
            loop++;
            int paw = 0 ;
            int sum = 0 ;

            int a = scanner.nextInt() ;
            int b = scanner.nextInt() ;
            int n = scanner.nextInt() ;

            sum +=a ;

            while (paw<n) {

                sum += (int) (Math.pow(2,paw) * b);
                System.out.print(sum + " ");
                paw++;

            }

            System.out.println();

        }

    }
}
