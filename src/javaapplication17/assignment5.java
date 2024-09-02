
package javaapplication17;

import java.util.ArrayList;
import java.util.Scanner;

public class assignment5 {
    public static ArrayList<Integer>EnterData(ArrayList<Integer>numbers) {
        Scanner sc=new Scanner (System.in);
        System.out.println("nhap mang:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("phan tu thu"+(i+1)+":");
            numbers.add(sc.nextInt());
        }
        return numbers;              
    }
    public static void printData(ArrayList<Integer>numbers) {
        System.out.print("xuat mang:");
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println("");       
    }
    public static int finmax2(ArrayList<Integer>numbers) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)>max1){
                max2=max1;
                max1=numbers.get(i);
            }
            else if(numbers.get(i)>max2 && numbers.get(i)<max1){
                max2=numbers.get(i);
            }
        }
        return max2;                   
    }
    public static void deteleOddNumber(ArrayList<Integer>numbers) {
        System.out.print("xoa phan tu le ra khoi mang :");
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                System.out.print(numbers.get(i)+" ");
            }
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        EnterData(number);
        
        printData(number);
        System.out.println("so lon thu 2 la:"+finmax2(number));
        deteleOddNumber(number);
    }
}
