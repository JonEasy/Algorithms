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

        public static void countSort(List<List<String>> arr) {
          // Write your code here
          int halfSize = arr.size()/2;
          // List<Integer> arrElements = new ArrayList<>(Collections.nCopies(100))
          HashMap<Integer,StringBuilder> result = new HashMap<>();
          // List<List<String>> result = Stream.generate(ArrayList<String>::new).limit(100).collect(Collectors.toList());
          for (int index=0;index<arr.size();index++){
            // String number = arr.get(index).get(0);
            StringBuilder word = new StringBuilder(arr.get(index).get(1));
            // int pos = Integer.parseInt(arr.get(index).get(0));
            // StringBuilder word = new StringBuilder(" ");
            if (index < halfSize) word = new StringBuilder("-");
            if (!result.containsKey(index)){
              result.put(index,new StringBuilder()); 
            }         
            StringBuilder appendWord = word.append(" ");
            result.get(index).append(appendWord);
            
          } 
          // result.forEach(s -> System.out.println(s));
          // System.out.println(result.stream().map(item -> String.join(" ", item)).collect(Collectors.joining(" ")).trim());
        
          for (Integer index: result.keySet()){
            String sentence = result.get(index).toString();
            System.out.print(sentence);
      }      
          return ;

        }

    }

    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      List<List<String>> arr = new ArrayList<>();
      
      int n = Integer.parseInt(bufferedReader.readLine().trim());
      IntStream.range(0,n).forEach(i -> {
      
        try {
          arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
          .collect(toList())
        );
        } catch (IOException e) {
          // TODO: handle exception
          throw new RuntimeException();

        
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
