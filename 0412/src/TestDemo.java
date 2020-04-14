import java.util.Scanner;

/**
 * @program: 0412
 * @description
 * @author: matilda
 * @create: 2020-04-12 14:59
 **/
public class TestDemo {
    public static int Fib(int n){
        if(n == 1 || n ==2)
            return 1;
        return Fib(n-1)+Fib(n-2);
    }

    public static int func(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + func(n/10);
    }


    public static int sum(int n){
        if(n == 1)
            return 1;
        return n + sum(n-1);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }


    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;

    }

    public static int maxThreeNum(int num1, int num2, int num3) {
        return maxNum(maxNum(num1, num2), num3);
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      int ret = maxThreeNum(a,b,c);
        System.out.println(ret);
    }
}