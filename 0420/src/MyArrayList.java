import java.util.Arrays;

/**
 * @program: 0419
 * @description
 * @author: matilda
 * @create: 2020-04-20 14:49
 **/
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList(){
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    private boolean isFull(){
        /*if (this.usedSize == this.elem.length){
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos){
        if (pos < 0 || pos >= this.usedSize){
            throw new RuntimeException("pos位置不合法！");
        }
    }

    //在pos位置新增元素
    public void add(int pos,int data){
        if (isFull()) {
            this.elem =
            Arrays.copyOf(this.elem,2*this.elem.length);//扩容
        }
        if (pos < 0 || pos >this.usedSize){
            return;
        }
        //挪数据了
        for (int i = this.usedSize-1;i >= pos;i++){
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        usedSize++;
    }

    public void display(){
        for (int i = 0;i < this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //判定是否包含某个元素 12
    public boolean contains(int toFind){
        for (int i = 0;i < this.usedSize;i++){
            if (toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
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
    //获取pos位置的元素
    public int getPos(int pos){
        //1、顺序表是否为空
        //2、pos的合法性
        //return pos的位置的数据就ok了
        if (isEmpty()){
            //return -1;
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
        /*if (pos < 0 || pos >= this.usedSize){
            return -1;
        }*/
        checkPos(pos);
        return this.elem[pos];
    }

    //删除第一次出现的关键字toRemove
    public void remove(int toRemove){
        int index = search(toRemove);
        if (index == -1){
            System.out.println("没有需要删除的数字！");
            return;
        }
        for (int i = index;i < this.usedSize-1;i++){
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }


    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }


    //更新pos位置的元素
    public void setPos(int pos,int value){
        checkPos(pos);
        this.elem[pos] = value;
    }
}
