import java.util.Scanner;

/**
 * @program: 0508
 * @description
 * @author: matilda
 * @create: 2020-05-08 19:53
 **/
public class TestDemo {

    public static String reverse(String str,int begin,int end) {
        char[] ch = str.toCharArray();
        while (begin < end){
            char tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }
        String ret = new String(ch);
        return ret;
    }

    public static void func(String str,int n){
        String tmp = reverse(str,0,n-1);
        String tmp1 = reverse(tmp,n,str.length()-1);
        String ret = reverse(tmp1,0,str.length()-1);
        System.out.println(ret);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        func(str,n);

    }

    public static void main1(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
