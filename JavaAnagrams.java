import java.util.*;

public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        String word1 = scanner.next();
        scanner.nextLine();
        String word2 = scanner.next();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (word1.length() == word2.length()) {
            for (int i=0 ; i < word1.length() ; i++) {

                Character letter1 = word1.charAt(i) ;
                Character letter2 = word2.charAt(i) ;

                if (map1.containsKey(word1.charAt(i))) {

                    map1.put(letter1, map1.get(letter1)+1);
                } else {

                    map1.put(letter1, 1) ;
                }


                if (map2.containsKey(word2.charAt(i))) {

                    map2.put(letter2, map2.get(letter2)+1);
                } else {

                    map2.put(letter2, 1) ;
                }

            }

            if (map1.equals(map2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams") ;
            }
        } else {
            System.out.println("Not Anagrams") ;
        }



    }
}