package javaapplication17;

import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        double a = sc.nextDouble();
        System.out.println("nhap b:");
        double b = sc.nextDouble();
        System.out.println("a+b=" + (int) (a + b));
        System.out.println("a-b=" + (int) (a - b));
        System.out.println("a*b=" + (long) (a * b));
        System.out.println("a/b=" + (double) (a / b));
        System.out.println("a%b=" + (int) (a % b));
    }

}
