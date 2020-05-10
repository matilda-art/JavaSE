/**
 * @program: 新建文件夹
 * @description
 * @author: matilda
 * @create: 2020-05-10 21:01
 **/
public class TestDemo3 {
    
    public static void main2(String[] args) {
        String str = "hello%##@@world嘿嘿~";
        //关于isEmpty()方法
        System.out.println("hello".isEmpty());//false
        System.out.println(new String().isEmpty());//true
        //长度
        System.out.println(str.length());
        //大小写转换:只转换字母
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    //去掉字符串中的左右空格，保留中间空格
    public static void main1(String[] args) {
        String str = "  hello   world   ";
        System.out.println("["+str.trim()+"]");
        //trim会去掉字符串开头和结尾的空白字符（空格，换行，制表符等）
    }
}
