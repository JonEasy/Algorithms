package Algorithms.sort.BigSort;

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    
        int n = Integer.parseInt(bufferedReader.readLine().trim());


        List<String> unsorted = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String unsortedItem = bufferedReader.readLine();
            unsorted.add(unsortedItem);
        }

        List<String> result = Result.bigSorting(unsorted);

        for (String s : result) {
            System.out.println(s);

        }
        bufferedReader.close();

    }
}
// Sample input
//6
//31415926535897932384626433832795
//1
//3
//10
//3
//5
//
// Sample Output 0

// 1
// 3
// 3
// 5
// 10
// 31415926535897932384626433832795
