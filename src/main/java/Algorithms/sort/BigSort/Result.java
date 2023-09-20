package Algorithms.sort.BigSort;

import java.util.Comparator;
import java.util.List;

class Result {
    public static List<String> bigSorting(List<String> unsorted) {
        unsorted.sort(new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() < b.length()) return -1;
                if (a.length() > b.length()) return 1;
                for (int i = 0; i < a.length(); i++) {
                    //System.out.println("Char is " + a + "Against " + b);
                    if (a.charAt(i) < b.charAt(i)) return -1;
                    if (a.charAt(i) > b.charAt(i)) return 1;
                }
                return 0;
            }
        });
        return unsorted;
    }

}

