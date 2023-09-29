package Algorithms.sort.ClosestNumer;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class Solution {
  static class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> closestNumbers(List<Integer> sortedElements) {
      
      Collections.sort(sortedElements);
      List<Integer> pairs = new ArrayList<>();
      int mindiff = Integer.MAX_VALUE;
      for (int index=1;index<sortedElements.size(); index++){
        int diff= sortedElements.get(index) - sortedElements.get(index-1);
        diff =  (diff<0) ? -diff : diff;

        if (diff<mindiff){
          mindiff= diff;
          pairs.clear();

          pairs.add(sortedElements.get(index-1));
          pairs.add(sortedElements.get(index));


        } else if (diff ==mindiff){

          pairs.add(sortedElements.get(index-1));
          pairs.add(sortedElements.get(index));
        }

      }
      return pairs;
    }
      
  } 

  public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int n = Integer.parseInt(bufferedReader.readLine().trim());

      List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
          .map(Integer::parseInt)
          .collect(toList());

      List<Integer> result = Result.closestNumbers(arr);

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

// Sample Input 1
// 
// 12
// -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
// Sample Output 1
// 
// -520 -470 -20 30
