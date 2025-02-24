import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        BigInteger number = new BigInteger(n) ;

        System.out.println(number.isProbablePrime(10) ? "prime" : "not prime");

    }
}
