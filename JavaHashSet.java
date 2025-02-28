import java.util.*;
public class JavaHashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] pair_left = new String[n];
        String [] pair_right = new String[n];

        for (int i = 0; i < n; i++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        sc.close();

        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] pair = {pair_left[i], pair_right[i]};
            Arrays.sort(pair);
            String sortedPair = pair[0] + "," + pair[1];
            uniquePairs.add(sortedPair);
            System.out.println(uniquePairs.size());

        }
    }
}