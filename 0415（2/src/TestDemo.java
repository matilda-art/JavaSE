import java.util.Arrays;

/**
 * @program: 0415（2
 * @description
 * @author: matilda
 * @create: 2020-04-15 18:47
 **/
public class TestDemo {
    /*冒泡排序*/
    public static void bubbleSort(int[] array){
        boolean flag = false;//没有发生交换
        for (int i = 0;i < array.length-1;i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;//发生交换
                }
            }
            if (flag == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    /*给定一个整形数组，判断是否该数组是有序的（升序*/
    public static boolean isUp(int[] array){
        for(int i = 0;i < array.length - 1;i++){
            if (array[i+1] < array[i]){
                return false;
            }
        }
        return true;
    }

    public static void main7(String[] args) {
        int[] array = {1,2,3,10,4,5};
        System.out.println(isUp(array));
    }



    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
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

    public static void main6(String[] args) {
        int[] array = {2,4,6,8,10};
        System.out.println(binarySearch(array,3));
    }



    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0;i < array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main5(String[] args) {
        int[] array = {12,2,18,24,76,13};
        System.out.println(findMax(array));
    }


    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }


    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }



    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }


    public static int[] copyArray(int[] array){
        int[] ret = new int[array.length];
        for (int i = 0;i < array.length;i++){
            ret[i] = array[i];
        }
        return ret;
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(array));
    }
}
