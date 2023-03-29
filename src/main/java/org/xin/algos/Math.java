package org.xin.algos;

public class Math {

    public static int lucasSeriesIteration(int n) {
        int previous = 2;
        int current = 1;
        for (int i = 1; i < n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        // return previous;
        return current;
    }

}
