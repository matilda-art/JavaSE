import java.util.Arrays;

/**
 * @program: 0415
 * @description
 * @author: matilda
 * @create: 2020-04-15 09:33
 **/
public class TestDemo {
    /*创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100*/
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }



    /*实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.*/
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main2(String[] args) {
        int [] array = {1,2,3,4,5};
        printArray(array);
    }


    /*实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}*/
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(transform(arr)));
    }

    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
