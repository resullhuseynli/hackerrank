import java.util.*;

public class JavaStringRevers {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuilder stringBuilder = new StringBuilder(A);

        String reversedWord = stringBuilder.reverse().toString() ;

        if (A.equals(reversedWord)) {
            System.out.println("Yes");

        } else {

            System.out.println("No") ;
        }

    }
}



