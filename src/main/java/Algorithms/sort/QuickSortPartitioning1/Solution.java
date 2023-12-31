
package Algorithms.sort.QuickSortPartitioning1;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




public class Solution {
    static class Result {

        /*
         * Complete the 'quickSort' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static List<Integer> quickSort(List<Integer> arr) {
            List<Integer> output = new ArrayList<Integer>();
            int sentinel = arr.get(0);
            for (int i=1; i<arr.size(); i++) {
                if (arr.get(i)<sentinel) output.add(arr.get(i));
            }
            output.add(sentinel);
            for (int i=1; i<arr.size(); i++) {
                if (arr.get(i)>sentinel) output.add(arr.get(i));
            }

            return output;

        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.quickSort(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

// Sample Input

// STDIN       Function
// -----       --------
// 5           arr[] size n =5
// 4 5 3 7 2   arr =[4, 5, 3, 7, 2]
// Sample Output

// 3 2 4 5 7

