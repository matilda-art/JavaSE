/**
 * @program: 0418（1
 * @description
 * @author: matilda
 * @create: 2020-04-18 09:49
 **/

/*
package NowCoder;
class Test {
    public static void hello() {
        System.out.println("hello");
    }
}
*/

/*public class TestDemo {
    public static void main1(String[] args) {
        // TODO Auto-generated method stub
        Test test = null;
        test.hello();
    }*/

    /*public class TestDemo {
        public int aMethod(){
            static int i = 0;
            i++;
            return i;
        }
        public static void main(String args[]){
            TestDemo test = new TestDemo();
            test.aMethod();
            int j = test.aMethod();
            System.out.println(j);
        }
    }*/

/*
public class TestDemo{
    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }
}*/

/*
public class TestDemo{

    private float f=1.0f;
    int m=12;
    static int n=1;
    public static void main(String args[]){
        TestDemo t=new TestDemo();
    }
}*/

/*
public class TestDemo {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        TestDemo hsl = new TestDemo();// 4
        hsl.x++;// 5
        TestDemo hs2 = new TestDemo();// 6
        hs2.x++;// 7
        hsl = new TestDemo();// 8
        hsl.x++;// 9
        TestDemo.x--;// 10
        System.out.println(" x=" + x);// 11
    }
}*/

/*
public class TestDemo{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };
}*/

/*class TestDemo {
    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }

    public static void main(String[] args) {
        System.out.println(new TestDemo());
    }
}*/

import java.util.Arrays;

public class TestDemo{
        public static void main(String[] args) {
            int arr1[] = {9,8,7,6,5,4,3,2,1};
            int arr2[] = {1,2,3,4,5,6,7,8,9};

            for(int i = 0;i < arr1.length;i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
            System.out.print("arr1[]=");
            System.out.println(Arrays.toString(arr1));
            System.out.print("arr2[]=");
            System.out.println(Arrays.toString(arr2));
        }




    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            while(left < right && arr[left]%2 == 0){
                left++;
            }
            while (left < right && arr[right]%2 != 0){
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        System.out.println("newarr:"+ Arrays.toString(arr));
    }
}