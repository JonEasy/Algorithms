package sort.Insertion2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */
    public static void printArray(List<Integer> arr){
        for (Integer element: arr) {
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    public static void insertionSort2(int n, List<Integer> arr) {

        for (int index=1; index <n; index ++) {
            int elementSort = arr.get(index);

            for (int backIndex=index-1; backIndex>=0; backIndex--){

                if (arr.get(backIndex)<=elementSort) {

                    arr.set(backIndex+1, elementSort);
                    printArray(arr);
                    break;
                }
                arr.set(backIndex+1, arr.get(backIndex));
            }
            if (arr.get(0)>elementSort) {
                arr.set(0, elementSort);
                printArray(arr);
            }
        }


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
