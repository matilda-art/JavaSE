import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: untitled
 * @description
 * @author: matilda
 * @create: 2020-04-13 21:11
 **/
public class TestDemo {
    /*青蛙跳台阶*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = FrogJump(n);
        System.out.println(sum);
    }

    public static int FrogJump(int n){
        if(n==1||n==2){
            return n;
        }
        return FrogJump(n-1)+FrogJump(n-2);
    }


    /*在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果*/
    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ret = addint(a, b);
        System.out.println(ret);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double ret2 = adddouble(a1,b1,c1);
        System.out.println(ret2);
    }

    public static int addint(int x,int y){
        return x + y;
    }
    public static double adddouble(double x,double y,double z){
        return x + y + z;
    }


    /*在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系*/
    public static void main8(String[] args) {
        int a = 1;
        int b = 2;
        int max1 = Max1(a, b);
        System.out.println("max1 = "+max1);
        double a1 = 1.1;
        double b1 = 2.2;
        double max2 = Max2(a1,b1);
        System.out.println("max2 = "+max2);
        int a2 = 1;
        double a3 = 2.1;
        double b2 = 1.1;
        double max3 = Max3(a2,a3,b2);
        System.out.println("max3 = "+max3);
        double min3 = Min3(a2,a3,b2);
        System.out.println("min3 = "+min3);
    }

    public static double Max3(int a,double b,double c){
        double max3;
        max3 = (a > b ? a : b) > c ? ( a > b ? a : b) : c;
        return max3;
    }

    public static double Min3(int a,double b,double c){
        double min3;
        min3=(a < b ? a : b) < c ? (a < b ? a : b) : c;
        return min3;
    }

    public static double Max2(double x,double y){
        double max1;
        if(x > y){
            max1 = x;
        }else {
            max1 = y;
        }
        return max1;
    }

    public static int Max1(int x,int y){
        int max1;
        if(x > y){
            max1 = x;
        }else {
            max1 = y;
        }
        return max1;
    }

    /*创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
      要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算*/
    public static int max2(int a,int b){
        return  a >  b ?  a :  b;
    }

    public static int max3(int a,int b,int c){
        int max = max2(a,b);
        return max2(max,c);
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println(max2(n1,n2));
        System.out.println(max3(n1,n2,n3));
    }


    /*调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。*/
    public static void main6(String[] args) {
        int[] arr = new int[]{4,6,7,9,2,1};
        int i;
        int j;
        for(i = 0;i < 6;i++){
            for(j = i+1;j < 6;j++){
                if(arr[j]%2 != 0){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }


    /*求 N 的阶乘 */
    public static void main5(String[] args) {
        System.out.println("请写出你要计算的阶乘数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        for (int i = 1;i <= n;i++){
            sum = sum*i;
        }
        System.out.println(n+"的阶乘为"+sum);
    }


    /*求1！+2！+3！+4！+........+n!的和*/
    public static int factor(int n){
        int sum = 0;
        int j = 1;
        for (int i =1;i <= n;i++){
            j = j*i;
            sum += j;
        }
        return sum;
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("阶乘之和为：");
        System.out.println(factor(n));
    }


    /*求斐波那契数列的第n项。(迭代实现)*/
    public static int fib(int num){
        int f1 = 1;
        int f2 = 1;
        if(num == 1 || num == 2){
            System.out.println("第"+num+"项的斐波那契数是"+1);
        }
        int i = 3;
        while (i <= num){
            f2 = f1 + f2;
            f1 = f2 -f1;
            i++;
        }
        System.out.println("第"+num+"项的斐波那契数是"+f2);
        return 0;
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想查找的斐波那契数列的项数：");
        int num = scanner.nextInt();
        fib(num);
    }


    /*有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。*/
    public static int findNumber(int[] num) {
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n ^= num[i];
        }
        return n;
    }

    public static void main2(String[] args) {
        int[] num = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(findNumber(num));
    }

    /*课堂*/
    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main1(String[] args) {
        int[] array = {12,34,1,6,2,9,21};
        System.out.println(Arrays.toString(array));
    }
}
