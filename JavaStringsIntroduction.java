import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.nextLine();
        String B=sc.next();


        System.out.println(A.length() + B.length());

        System.out.println(checker(A,B));


        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase() + " " + B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());

    }

    public static String checker(String word1, String word2) {

        if (word1.compareTo(word2)>0) {
            return "Yes" ;
        }
        return "No" ;

    }

}



