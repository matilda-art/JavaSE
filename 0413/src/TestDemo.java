import java.util.Random;
import java.util.Scanner;

/**
 * @program: 0413
 * @description
 * @author: matilda
 * @create: 2020-04-13 09:44
 **/
public class TestDemo {
    /*6.青蛙跳台阶*/
    public int Jump(int target) {
        if(target < 3){
            return target;
        }
        return 2 * Jump(target -1);
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }


    /*5.乘法口诀表*/
    public static void main5(String[] args) {
        for (int i = 1; i <= 9;i++ ) {
            for (int j = 1;j <= i;j++ ) {
                System.out.print(i + "*" + j +"="+i*j +" ");
            }
            System.out.println();
        }
    }


    /*4. 完成猜数字游戏*/
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);
        System.out.println(randNum);
        while (true){
            System.out.println("请输入你要猜的数字：");
            int num = scanner.nextInt();
            if(num < randNum){
                System.out.println("你猜的数字小了！");
            }else if(num == randNum){
                System.out.println("你猜对了！");
                break;
            }else{
                System.out.println("你猜的数字大了！");
            }
        }
    }

    /*3. 输出 1000 - 2000 之间所有的闰年 */
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int year = 1000;year <= n;year++){
            if(year%100 != 0 && year%4 ==0 || year%400 == 0) {
                System.out.println("是闰年");
            }
        }
    }


    /*2. 判定一个数字是否是素数*/
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
            System.out.println("是素数");
        }
    }


    /*1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 18){
            System.out.println("少年");
        }else if(n >= 19 && n <= 28){
            System.out.println("青年");
        }else if(n >= 29 && n <=55){
            System.out.println("中年");
        }else if(n >= 56){
            System.out.println("老年");
        }
    }
}
