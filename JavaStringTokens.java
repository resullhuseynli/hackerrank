import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        String sentence = scanner.nextLine() ;
        scanner.close() ;

        String[] words = sentence.split("[!?._'@ ,]") ;

        List<String> resultList = new ArrayList<>();


        for (String word : words) {

            if (!Objects.equals(word, "")) {
                resultList.add(word);
            }
        }

        System.out.println(resultList.size()) ;

        for (String word : resultList) {
            System.out.println(word);
        }

    }
}