/**
 * @program: 新建文件夹
 * @description
 * @author: matilda
 * @create: 2020-04-20 19:01
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
        if (this.head == null){
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }


    //尾插法
    public void addLast(int data){
        Node node = new Node(data);

        if (this.head == null){
            //第一次插入节点
            this.head = node;
            return;
        }

        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }


    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node node = new Node(data);
        Node cur = this.head;
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == this.size()){
            addLast(data);
            return;
        }
        //先找到index位置前一个节点的地址
        searchIndex(index);
        //进行插入
        node.next = cur.next;
        cur.next = node;
    }

    private Node searchIndex(int index){
        //对index进行合法性检查
        if(index < 0 || index > this.size()){
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
        int count = index-1;
        while (count != 0){
            cur = cur.next;
            count--;
        }
        return cur;
    }



    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }


    //打印单链表
    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }

}
