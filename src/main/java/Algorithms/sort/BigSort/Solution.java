package Algorithms.sort.BigSort;

import java.io.*;
import java.util.*;
// import sort.BigSort.Result;

//class Result {
//    public static List<String> bigSorting(List<String> unsorted) {
//        unsorted.sort(new Comparator<String>() {
//            public int compare(String a, String b) {
//                if (a.length() < b.length()) return -1;
//                if (a.length() > b.length()) return 1;
//                for (int i = 0; i < a.length(); i++) {
//                    //System.out.println("Char is " + a + "Against " + b);
//                    if (a.charAt(i) < b.charAt(i)) return -1;
//                    if (a.charAt(i) > b.charAt(i)) return 1;
//                }
//                return 0;
//            }
//        });
//        return unsorted;
//    }

//}


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
