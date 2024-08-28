
package javaapplication17;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Random random=new Random();
        int n=random.nextInt(100)+1;
        System.out.println("nhap check");
        String check=sc.nextLine();
        if(check.equalsIgnoreCase("yes")){
            if(n%2==0){
                System.out.println(n+"la so chan");
            }
            else {
                System.out.println(n+"la so le");
            }
            
        }
        else {
            if(n%2==0){
                System.out.println(n+"la so chan");
            }
            else {
                System.out.println(n+"la so le");
            }
        }
    }
}
