package Algorithms.sort.Insertion1;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {

        int elementSort = arr.get(n-1);
        //System.out.println("Element sort is " + elementSort);
        for (int i=n-2; i>=0; i--) {
            //System.out.println("Current index is " + i + " with element " + arr.get(i) + " and element sort is " + elementSort);
            if (arr.get(i)<=elementSort) {
                arr.set(i+1,  elementSort);
                break;
            }
            arr.set(i+1, arr.get(i));
            for (int index=0; index<n; index++) {
                System.out.print(arr.get(index) + " ");
            }
            System.out.println();
        }
        if (arr.get(0)>elementSort) {
            arr.set(0, elementSort);
        }

public class Solution {
    static class Result {

      /*
       * Complete the 'insertionSort1' function below.
       *
       * The function accepts following parameters:
       *  1. INTEGER n
       *  2. INTEGER_ARRAY arr
       */

        private static void insertionSort1(int n, List<Integer> arr) {

          int elementSort = arr.get(n-1);
          //System.out.println("Element sort is " + elementSort);
          for (int i=n-2; i>=0; i--) {
              //System.out.println("Current index is " + i + " with element " + arr.get(i) + " and element sort is " + elementSort);
              if (arr.get(i)<=elementSort) {
                  arr.set(i+1,  elementSort);
                  break;
              }
              arr.set(i+1, arr.get(i));
              for (int index=0; index<n; index++) {
                  System.out.print(arr.get(index) + " ");
              }
              System.out.println();
          }
          if (arr.get(0)>elementSort) {
              arr.set(0, elementSort);
          }

          for (int index=0; index<n; index++) {
              System.out.print(arr.get(index) + " ");
          }
          System.out.println();
      }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.insertionSort1(n, arr);


        bufferedReader.close();
    }
}

// Sample Input

// 5
// 2 4 6 8 3
// Sample Output

// 2 4 6 8 8 
// 2 4 6 6 8 
// 2 4 4 6 8 
// 2 3 4 6 8
