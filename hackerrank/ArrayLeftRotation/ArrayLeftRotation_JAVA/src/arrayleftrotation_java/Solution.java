package arrayleftrotation_java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] leftRotation(int[] in, int n/*VectorSize*/, int k/*Shifts*/) {
        int temp[] = new int[n];
        System.arraycopy(in, 0, temp, 0, n);
        for (int i = 0; i < n; i++) {
            int y = i - k;
            if (y < 0) {
                y += n;
            }
            in[y] = temp[i];
        }
        return in;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        a = leftRotation(a, n, k);
        for (int i=0; i<n;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
