package javaapplication17;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
