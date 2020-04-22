import java.util.Scanner;

/**
 * @program: untitled
 * @description
 * @author: matilda
 * @create: 2020-04-14 21:34
 **/
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(N+"!="+Factorial(N));
    }
    public static int Factorial(int n) {
        if(n==1) {
            return 1;
        }else {
            return n*Factorial(n-1);
        }
    }


    /*递归求 1 + 2 + 3 + … + 10*/
﻿    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Factorial(n));
    }

    public static int Factorial(int n) {
        if (n > 1) {
            return n + Factorial(n - 1);
        } else {
            return n;
        }
    }



    /*递归打印数字的每一位*/
    public static void main3(String[] args) {
        System.out.print("请输入一个数字：");
        Scanner s = new Scanner(System.in);
        int integer = s.nextInt();
        splitInteger(integer);
    }

    public static int splitInteger(int integer) {
        if(integer > 9) {
            splitInteger(integer/10);
        }
        System.out.print(integer%10 + " ");
        return 0;
    }


    /*写一个递归方法，输入一个非负整数，返回组成它的数字之和*/
    public static void main2(String[] agrs) {
        System.out.print("请输入一个非负整数：");
        Scanner s = new Scanner(System.in);
        int integer = s.nextInt();
        System.out.print(SumInteger(integer))；
    }

    public static int SumInteger(int integer) {
        int sum = 0;
        if(integer != 0) {
            int i = integer%10;
            integer = integer/10;
            sum = i + SumInteger(integer);
        }
        return sum;
    }


    /*递归求斐波那契数的第n项*/public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
}

