package Algorithms.sort.FullCountingSort;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    static class Result {

        /*
         * Complete the 'countingSort' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static List<Integer> countSort(List<List<Integer>> arr) {
          // Write your code here
           
          // List<Integer> arrElements = new ArrayList<>(Collections.nCopies(100,0));
          // for (int index=0; index<arr.size();index++){
          //   int element = arr.get(index);
          //   arrElements.set(element, arrElements.get(element)+1);  
          // }
          // List<Integer> sortedElements = new ArrayList<>();
          // for (int index = 0; index < arrElements.size(); index++) {
          //   int value = arrElements.get(index);
          //   for (int j = 0; j < value; j++) {            
          //     sortedElements.add(index);
          //   } 
          // }
          // return sortedElements;

        }

    }

    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      List<List<String>> arr = new ArrayList<>();
      
      int n = Integer.parseInt(bufferedReader.readLine().trim());
      IntStream.range(0,n).forEach(i -> {
      
        try {
          arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(""))
          .collect(toList())
        );
        } catch (IOException e) {
          // TODO: handle exception
          throw new RuntimeException(e);
        
        }

    });


      Result.countSort(arr);


      bufferedReader.close();
    }
}



// Sample Input

// 20
// 0 ab
// 6 cd
// 0 ef
// 6 gh
// 4 ij
// 0 ab
// 6 cd
// 0 ef
// 6 gh
// 0 ij
// 4 that
// 3 be
// 0 to
// 1 be
// 5 question
// 1 or
// 2 not
// 4 is
// 2 to
// 4 the
// Sample Output

// - - - - - to be or not to be - that is the question - - - -
