/**
 * @program: 新建文件夹
 * @description
 * @author: matilda
 * @create: 2020-05-10 20:44
 **/
public class TestDemo2 {

    //字符串截取：前闭后开区间的写法，substring(0,5)表示包含0号下标的字符，不包含5号下标
    public static void main5(String[] args) {
        String str = "helloworld";
        System.out.println(str.substring(5));//从指定索引截取到结尾
        System.out.println(str.substring(0,5));//截取部分内容
    }

    //多次拆分
    public static void main4(String[] args) {
        String str = "name=zhuyilong&age=32";
        String[] result = str.split("&");
        for (int i = 0;i < result.length;i++){
            String[] tmp = result[i].split("=");
            System.out.println(tmp[0]+"="+tmp[1]);
        }
    }

    //将字符串部分拆分，该数组长度就是limit极限
    public static void main3(String[] args) {
        String str = "welcome to our shool";
        String[] result = str.split(" ",3);
        for (String s:result) {
            System.out.println(s);
        }
    }

    //将字符串全部拆分
    public static void main(String[] args) {
        String str = "welcome to our shool";
        String[] result = str.split(" ");//按照空格拆分
        for (String s:result) {
            System.out.println(s);
        }
    }

    //字符串的替换处理
    public static void main1(String[] args) {
        String str = "hello world";
        System.out.println(str.replaceAll("l","_"));//替换所有
        System.out.println(str.replaceFirst("l","_"));//替换首个内容
    }
}
