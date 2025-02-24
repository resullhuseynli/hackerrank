import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;



public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();


        int maxValue = getMaxValue(arr);

        System.out.println(maxValue);

    }

    private static int getMaxValue(List<List<Integer>> arr) {
        List<Integer> mySumList = new ArrayList<>();

        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<4 ; j++) {

                int sum = 0 ;
                sum += arr.get(i).get(j)
                        + arr.get(i).get(j+1)
                        + arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1)
                        + arr.get(i+2).get(j)
                        + arr.get(i+2).get(j+1)
                        + arr.get(i+2).get(j+2);

                mySumList.add(sum) ;

            }
        }

        int maxValue = mySumList.get(0);

        for (int i = 1 ; i < mySumList.size() ; i++) {
            maxValue = Math.max(maxValue, mySumList.get(i));
        }
        return maxValue;
    }
}
