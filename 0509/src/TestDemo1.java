/**
 * @program: 0509
 * @description
 * @author: matilda
 * @create: 2020-05-09 21:22
 **/
public class TestDemo1 {
    public static int myIndexOftest(String s1,String s2)
    {
        String temp;
        int length = s2.length();
        for(int i = 0;i < s1.length()-length;i++)
        {
            temp = s1.substring(i, i+length);
            if(temp.equals(s2))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "a,b,c,d,e,f";
        String s2 = "a,b,c";
        int i = myIndexOftest(s1,s2);
        System.out.println(i);
    }

    //实现方法 indexOf, 能够找出字符串子串存在的位置
    public static int indexOf(Object o, int index,char elementCount,String[] elementData) {
        if (o == null) {
            for (int i = index ; i < elementCount ; i++)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = index ; i < elementCount ; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

}
