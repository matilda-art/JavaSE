/**
 * @program: 0425
 * @description
 * @author: matilda
 * @create: 2020-04-25 14:03
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        while (this.head == null){
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        while (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    private Node searchIndex(int index){
        if (index < 0 || index > this.size()){
            throw new RuntimeException("不合法");
        }
        Node cur = this.head;
        while (index-1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node node = new Node(data);
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == this.size()){
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
     if (this.head == null){
         return;
     }
     if (this.head.data == key){
         this.head = this.head.next;
         return;
     }
     Node prev = searchIndex(key);
     Node cur = prev.next;
     prev.next = cur.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null){
            if (cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }
            prev = cur;
            cur = cur.next;
        }
        if (this.head.data == key){
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        this.head = null;
    }

}
