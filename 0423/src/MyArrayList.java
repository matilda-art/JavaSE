/**
 * @program: 0423
 * @description
 * @author: matilda
 * @create: 2020-04-23 18:39
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyArrayList {
    public Node head;

    private Node searchPrev(int key){
        Node prev = this.head;
        while (prev.next != null){
            if (prev.next.data != key){
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }

    //删除第一次出现关键字key的节点
    public void remove(int key){
        if(this.head == null){
            return;
        }
        //删除的是不是头节点
        if (this.head.data == key){
            this.head = this.head.next;
            return;
        }
        //找到节点的前驱
        Node prev = searchPrev(key);
        if (prev == null){
            System.out.println("没有这个节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public  void removeAllKey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null){
            if (cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
            if (this.head.data == key){
                this.head = this.head.next;
            }
        }
    }


    //释放内存
    public void clear(){
        this.head = null;
    }


    //反转单链表
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }


    // 给定一个带有头结点 head 的非空单链表，
    // 返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
