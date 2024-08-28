package javaapplication17;

import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ho va ten :");
        String hvt = sc.nextLine();
        System.out.println("nam sinh :");
        int namsinh = sc.nextInt();
        System.out.println("tuoi :");
        int tuoi = sc.nextInt();
        System.out.println("gioi tinh :");
        String gt = sc.next();
        System.out.println("GPA :");
        double h = sc.nextDouble();
        sc.nextLine();
        System.out.println("que quan :");
        String quequan = sc.nextLine();

        System.out.println(hvt);
        System.out.println(namsinh);
        System.out.println(tuoi);
        System.out.println(gt);
        System.out.println(h);
        System.out.println(quequan);
    }
}
