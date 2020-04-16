import java.util.Arrays;

/**
 * @program: 0416
 * @description
 * @author: matilda
 * @create: 2020-04-15 22:00
 **/
public class TestDemo {
    /*实现一个方法 toString, 把一个整型数组转换成字符串.
    例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.*/
    public static String toString(int[] arr) {
        String ret = "\"";
        ret += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                ret += arr[i] + ",";
            } else if (i == arr.length - 1) {
                ret += arr[i] + "]";
            }
        }
        ret += "\"";
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(toString(arr));
    }


    /*实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组. */
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }


    /*给定一个有序整型数组, 实现二分查找*/
    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key < array[mid]) {
                right = mid - 1;
            }
            if (key > array[mid]) {
                left = mid + 1;
            }
            if (array[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] array = {2,4,6,8,10};
        System.out.println(binarySearch(array,3));
    }



    /*给定一个整型数组, 判定数组是否有序（递增）*/
    public static boolean isUp(int[] array){
        for (int i = 0;i < array.length-1;i++){
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main2(String[] args) {
        int[] array = {1,2,4,5,6,8,10};
        System.out.println(isUp(array));
    }


    /*给定一个整型数组, 实现冒泡排序(升序排序)*/
    public static void bubbleSort(int[] array){
        for (int i = 0;i < array.length;i++){
            boolean flag = false;
            for (int j = 0;j < array.length-1-i;j++){
                if (array[j] > array [j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
    }

    public static void main1(String[] args) {
        int[] array = {5,4,1,9,2,12,3,8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
