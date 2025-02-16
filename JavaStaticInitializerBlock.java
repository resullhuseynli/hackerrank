import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int b = scanner.nextInt() ;
        int h = scanner.nextInt() ;

        if ( h > 0 && b > 0) {

            System.out.println( h * b);

        } else {

            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }

    }
}
