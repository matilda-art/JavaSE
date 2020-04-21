import java.util.Arrays;

/**
 * @program: 0421
 * @description
 * @author: matilda
 * @create: 2020-04-21 14:47
 **/

//顺序表

public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;


    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

     // 打印顺序表
    public void display() {
        for (int i = 0;i < this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }


    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if (pos < 0 || pos > this.usedSize){
            return;
        }
        for (int i = this.usedSize-1;i >= pos;i++){
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        usedSize++;
    }


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0;i < this.usedSize;i++){
            if (toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }


    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0;i < this.usedSize;i++){
            if (toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }


    private boolean isEmpty(){
        return this.usedSize == 0;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("不合法");
        }
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        return this.elem[pos];
    }


    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        getPos(pos);
        this.elem[pos] = value;
    }


    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1){
            System.out.println("没有要删徐的元素");
            return;
        }
        for (int i = 0;i < this.usedSize-1;i++){
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }


    // 获取顺序表长度
    public int size() {
        return this.elem.length;
    }


    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

}