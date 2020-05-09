import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: 0509
 * @description
 * @author: matilda
 * @create: 2020-05-09 18:50
 **/
public class TestDemo {

    //实现方法 compareTo, 能够实现按照字典序比较字符串大小
    public static int myCompareTo(char[] s1,char[] s2){
        int len1 = s1.length;
        int len2 = s2.length;
        int lim = Math.min(len1, len2);
        char v1[] = s1;
        char v2[] = s2;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }

    public static void main(String[] args) {
        char[] s1 = {'a'};
        char[] s2 = {'A'};
        System.out.println(myCompareTo(s1, s2));
    }

    public static void main7(String[] args) {
        System.out.println("a".compareTo("A"));//大于
        System.out.println("a".compareTo("a"));//相等
        System.out.println("A".compareTo("a"));//小于
    }

    //实现方法 contains, 能够判定字符串中是否包含子串
    public static boolean myIndexOftest(String s1,String s2)
    {
        String temp;
        int length = s2.length();
        for(int i = 0;i < s1.length()-length;i++)
        {
            temp = s1.substring(i, i+length);
            if(temp.equals(s2))
                return true;
        }
        return false;
    }

    public static void main8(String[] args) {
        String s1 = "a,b,c,d,e,f";
        String s2 = "a,b,c";
        System.out.println(myIndexOftest(s1, s2));
    }

    public static void main6(String[] args) {
        String str = "welcometoourshool";
        System.out.println(str.contains("our"));
    }

    //实现方法 indexOf, 能够找出字符串子串存在的位置
    public static void main5(String[] args) {
        String str = "helloworld";
        System.out.println(str.indexOf("ld"));
        System.out.println(str.indexOf("our"));
        if (str.indexOf("ld") != -1) {
            System.out.println("可以查到指定字符串！");
        }
    }


    //实现方法 replace, 能够替换字符串中的某个部分
    public static void main9(String args[])
        {
            Scanner cin = new Scanner(System.in);
            while(cin.hasNext())
            {
                String A = cin.next();
                String B = cin.next();
                String C = cin.next();
                A = A.replace(B, C);

                System.out.println();
            }
        }



    public static void main4(String[] args) {
        String str = "hello world";
        System.out.println(str.replace("l","."));
    }

    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
    public static void main3(String[] args) {
       String str = "welcome to our shool!";
       String[] result = str.split(" ",2);
        for (String s: result) {
            System.out.println(s);
        }
    }


    //验证homework
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main2(String[] args){
        System.out.println(isAdmin("Admin"));
    }

    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main1(String args[]){
        TestDemo ex = new TestDemo();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
}
