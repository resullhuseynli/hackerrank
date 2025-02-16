import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        int line = 0 ;

        while (scanner.hasNext()) {

            String word = scanner.nextLine() ;

            line++ ;

            System.out.println(line + " " + word);

        }

        scanner.close();

    }

}
