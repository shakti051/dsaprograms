package com.company.sorting;
import java.util.Arrays;

public class ClosePoint {
    /**Given a list of points and a number k, find the k closest points to the origin.**/
    public static void main(String[] args) {
        int points[][] = { { 1, 1 },
                { 3, 3 },
                { 4, 4 },
                { -1, -1 },
                { 2 ,2 } };
        int K = 3;
        pClosest(points, K);
    }

    static void pClosest(int [][]pts, int k)
    {
        int n = pts.length;
        int[] distance = new int[n];
        for(int i = 0; i < n; i++)
        {
            int x = pts[i][0], y = pts[i][1];
            distance[i] = (x * x) + (y * y);
        }

        Arrays.sort(distance);

        // Find the k-th distance
        int distk = distance[k - 1];

        // Print all distances which are
        // smaller than k-th distance
        for(int i = 0; i < n; i++)
        {
            int x = pts[i][0], y = pts[i][1];
            int dist = (x * x) + (y * y);

            if (dist <= distk)
                System.out.println("[" + x + ", " + y + "]");
        }
    }
}
