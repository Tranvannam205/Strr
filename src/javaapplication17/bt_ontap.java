
package javaapplication17;

import java.util.Arrays;
import java.util.Scanner;


public class bt_ontap {
    public static float [] importData(float []arr) {
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("nhap cac phan tu mang"+(i+1)+":");
           arr[i]=sc.nextFloat();
        }
        return arr;
    }
    public static  void printData(float[ ] arr) {
        System.out.print("xuat mang:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    public static  float findMax2(float[ ] arr){
        float max1=Integer.MIN_VALUE;
        float max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        return max2;       
    }
    public static void deleteOddNumber(float[ ] arr) {
        int cnt=0;
        for(float x:arr){
            if(x%2==0){
                cnt++;
            }
        }
        float []red=new float[cnt];
        int cntt=0;
        for(float x:arr){
            if(x%2==0){
                red[cntt++]=x;
            }
        }
        System.out.println("xoa phan tu le trong mang:"+Arrays.toString(red));
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap mang:");
        int n=sc.nextInt();
        float []arr=new float[n];
        arr=importData(arr);
        printData(arr);
        System.out.println("so lon thu 2 trong mang la:"+findMax2(arr));
        deleteOddNumber(arr);
        
        
    }
}
