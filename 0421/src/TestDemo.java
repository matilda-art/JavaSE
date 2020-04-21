/**
 * @program: 0421
 * @description
 * @author: matilda
 * @create: 2020-04-21 14:46
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList2 myArrayList2 = new MyArrayList2();
        myArrayList2.addFirst(10);
        myArrayList2.addFirst(11);
        myArrayList2.addFirst(12);
        myArrayList2.addFirst(13);
        myArrayList2.addIndex(3,99);
        myArrayList2.display();
    }
}
