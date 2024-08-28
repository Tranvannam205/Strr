package javaapplication17;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            cnt++;
        }
        double tbc = (double) sum / cnt;
        System.out.println("tong cac phan tu trong mang :" + sum);
        System.out.println("trung binh cong cua cac phan tu trong mang :" + tbc);
    }
}
