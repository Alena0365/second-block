package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int inputInt (){
        Scanner in = new Scanner(System.in);
        int vvod = in.nextInt();
        return vvod;
    }
    public static double inputDouble (){
        Scanner in = new Scanner(System.in);
        double vvod = in.nextDouble();
        return vvod;
    }
    public static String inputStr (){
        Scanner in = new Scanner(System.in);
        String vvod = in.nextLine();
        return vvod;
    }
    public static char inputchar () throws IOException {
        Scanner in = new Scanner(System.in);
        char vvod=(char)System.in.read();
        return vvod;
    }
    public static String task1(String  str, int n){
        String str1=new String();
        for(int i=0;i<str.length();i++){
            char sim=str.charAt(i);
            for(int j=0;j<n;j++){
                str1+=sim;
            }
        }
        return str1;
    }
    public static int task2(int [] arr){
        int min=arr[0]; int max=arr[0];
        for (int i=0; i<arr.length-1;i++){
            if (arr[i+1]>max){max=arr[i+1];}
            else if (arr[i+1]<min){min=arr[i+1];}
        }
        int res=max-min;
        return res;
    }
    public static boolean task3(int[]arr){
        int sum=0; int count=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            count+=1;
        }
        if (sum%count==0){return true;}
        else return false;
    }

    public static int [] task4(int[]arr){
        int[]arr1=new int[arr.length];
        arr1[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            arr1[i]=arr[i]+arr1[i-1];
        }
        return arr1;
    }

    public static void task5(double a) {
        System.out.println(String.valueOf(a).split("\\.")[1].length()) ;
    }
   public static int task6(int a){
       int[]arr=new int[a+1];
       arr[0]=arr[1]=1;
       int sum=1;
       for (int i=2;i<arr.length-1;i++){
           arr[i]=arr[i-1]+arr[i-2];
           sum=arr[i]+arr[i-1];
       }
       return sum;
   }

   public static boolean task7(String str){
           if (str.length() == 5) {
               for (int i = 0; i < 5; i++) {
                   if (str.charAt(i) < '0' || str.charAt(i) > '9')
                       return false;
               }
               return true;
           }
           else
               return false;
   }
    public static boolean task8(String str, String str1){
       char firstF; char firstS; char lastF=0; char lastS=0;
        firstF=str.charAt(0);
        firstS=str1.charAt(0);
       for (int i = 0; i < str.length(); i++) {
            lastF=str.charAt(i);
        }
        for (int j = 0; j < str1.length(); j++) {
            lastS=str1.charAt(j);
        }
        if ((firstF==lastS) &&(lastF==firstS)){return true;}
        else return false;
    }
    public static boolean isPrefix(String str, String str1){
        for (int i = 0; i < str1.length(); i++){
            if (str.charAt(i) == str1.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static boolean isSuffix(String str, String str1) {
        for (int i = 1; i < str1.length(); i++){
            if (str.charAt(str.length() - 1 - i) == str1.charAt(str1.length() - 1 - i)){
                return true;
            }
        }
        return false;
    }

    public static int task10(int a){
      int b=0;
      for (int i=1; i<=a;i++){
          if(i%2==1){
              b+=3;
          }
          else {b-=1;}
       }
      return b;
    }


    public static void main(String[] args) {
       /* System.out.println("Введите слово:");
        String str=inputStr();
        System.out.println("Введите число n: ");
        int n=inputInt();
        System.out.println("Результат:" + task1(str,n));
        System.out.println("Введите длину массива:");
        int[]arr=new int[inputInt()];
        System.out.println("Введите элементы массива: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=inputInt();
        }
        System.out.println("Разница между наибольшим и наименьшим числом:" + task2(arr));

        System.out.println("Введите длину массива:");
        int[]arr1=new int[inputInt()];
        System.out.println("Введите элементы массива: ");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=inputInt();
        }
        System.out.println("Результат: " + task3(arr1));

        System.out.println("Введите длину массива:");
        int[]arr2=new int[inputInt()];
        System.out.println("Введите элементы массива: ");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=inputInt();
        }
        System.out.println(Arrays.toString(task4(arr2)));

        double d=inputDouble();
        task5(d);

        int a=inputInt();
        System.out.println(task6(a));

        String arr4=inputStr();
        System.out.println(task7(arr4));

        String str1=inputStr(); String str2=inputStr();
        System.out.println(task8(str1, str2));

        String str3=inputStr(); String str4=inputStr();
        System.out.println(isPrefix(str3, str4));
        String str5=inputStr(); String str6=inputStr();
        System.out.println(isSuffix(str5, str6));*/

        int b=inputInt();
        System.out.println(task10(b));
    }
}
