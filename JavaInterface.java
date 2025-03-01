import java.util.*;

public class JavaInterface {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();

        int number = sc.nextInt();

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisorSum(number));

        sc.close();
    }
}

class MyCalculator implements AdvancedArithmetic {

    public Integer divisorSum(int number) {

        int sum = 0;
        for (int i=1 ; i <= number/2 ; i++) {

            if (number % i == 0) {
                sum +=i;
            }
        }
        return sum+number;
    }
}

interface AdvancedArithmetic {

    Integer divisorSum(int number);
}