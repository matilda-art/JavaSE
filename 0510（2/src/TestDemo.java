/**
 * @program: 新建文件夹
 * @description
 * @author: matilda
 * @create: 2020-05-10 14:17
 **/
public class TestDemo {

    //判断开头或结尾
    public static void main(String[] args) {
        String str = "**@@hello world!!";
        System.out.println(str.startsWith("**"));//true
        System.out.println(str.endsWith("!!"));//true
    }

    //关于indexOf
    public static void main8(String[] args) {
        String str = "hello world";
        System.out.println(str.indexOf("l"));//2 只能返回查找的第一个位置
        System.out.println(str.indexOf("l",5));//从下标为5的地方开始查找
        System.out.println(str.lastIndexOf("l"));//8  从后向前查找
    }

    //从头开始查找指定字符串的位置，查到了返回位置的开始索引，如果查不到返回-1
    public static void main7(String[] args) {
        String str = "hello world";
        System.out.println(str.indexOf("world"));//5
        System.out.println(str.indexOf("our"));//-1
        if (str.indexOf("hello") != -1){
            System.out.println("可以查到指定字符串");
        }
    }

    //判断一个字符串是否存在
    public static void main6(String[] args) {
        String str = "hello world";
        System.out.println(str.contains("hello"));//true
    }



    //比较两个字符串大小关系
    public static void main5(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println("A".compareTo("a"));//小于
        System.out.println("a".compareTo("A"));//大于
        System.out.println("A".compareTo("A"));//相等，返回0
    }

    //关于区不区分大小写的比较
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//false 区分大小写的比较
        System.out.println(str2.equalsIgnoreCase(str2));//true 不区分大小写的比较
    }

   //实现字符串与字节数组的转换
   public static void main3(String[] args) {
       String str = "hello world";
       //String转byte[]
       byte[] data = str.getBytes();
       for(int i = 0;i <data.length;i++){
           System.out.println(data[i]+" ");
       }
       //byte[]转String
       System.out.println(new String(data));
   }

    //字符串与字符数组的转换
    public static void main2(String[] args) {
        String str = "hello world";
        //字符串变为字符数组
        char[] data = str.toCharArray();
        for (int i = 0;i < data.length;i++){
            System.out.println(data[i]+" ");
        }
        //字符数组转为字符串
        System.out.println(new String(data));//全部转换
        System.out.println(new String(data,5,5));//部分转换
    }

    //类型：普通。    取得指定索引位置的字符，索引从0开始。
    public static void main1(String[] args) {
        String str = "hello world";
        System.out.println(str.charAt(0));
    }
}
