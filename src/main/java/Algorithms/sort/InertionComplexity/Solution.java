import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    static class Result {

        /*
         * Complete the 'runningTime' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
        public static void printArray(List<Integer> arr){
            for (Integer element: arr) {
                System.out.print(element+ " ");
            }
            System.out.println();
        }     

        public static int runningTime(List<Integer> arr) {
            int count= 0;
            int n = arr.size();
            
            for (int index=1; index <n; index ++) {
                int elementSort = arr.get(index);
                for (int backIndex=index-1; backIndex>=0; backIndex--){
                    if (arr.get(backIndex)<=elementSort) {
                        arr.set(backIndex+1, elementSort);
                        printArray(arr);
                        break;
                    }
                    arr.set(backIndex+1, arr.get(backIndex));
                    count++;
                }
                if (arr.get(0)>elementSort) {
                    arr.set(0, elementSort);
                    printArray(arr);
                    System.out.println("Index 0 with " + arr.get(0) +" element sort "+ elementSort);
                    //count++;
                }
            }
            return count;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
