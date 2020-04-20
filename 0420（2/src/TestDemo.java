/**
 * @program: 新建文件夹
 * @description
 * @author: matilda
 * @create: 2020-04-20 18:37
 **/

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.addIndex(3,99);
        myLinkedList.display();
    }
}
