package com.company;

import java.io.IOException;
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

   /* public static int task5(String arr){
        String str=".";
        int count=0;
        char[] ch=arr.toCharArray();
        String [] arr1 = new String[ch.length];
        for(int i=0;i<ch.length;i++){
            arr1[i]= String.valueOf(ch[i]);
            if( arr1[i]==str){
                for(int j=i;j<ch.length;j++){count+=1;}
            }
        }
        return count;
    }*/
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
       String str1=new String;

       for(int i=0;i<str.length();i++){
           char sim=str.charAt(i);
           str1+=sim;
           if(str1.length()==5)&&(sim!=" ")

       }
       return ;
   }
    public static void main(String[] args) {
      /*System.out.println("Введите слово:");
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


        String arr3=inputStr();
        System.out.println(task5(arr3));

      int a=inputInt();
      System.out.println(task6(a));*/

    }
}
