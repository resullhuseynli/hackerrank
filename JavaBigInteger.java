import java.util.*;
import java.math.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        BigDecimal number = new BigDecimal(scanner.next()) ;
        BigDecimal key = new BigDecimal(scanner.next()) ;
        scanner.close() ;

        System.out.println(number.add(key));
        System.out.println(number.multiply(key));
    }
}