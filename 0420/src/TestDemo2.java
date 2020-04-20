/**
 * @program: 0419
 * @description
 * @author: matilda
 * @create: 2020-04-20 14:47
 **/


public class TestDemo2 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        MyArrayList myArrayList2 = new MyArrayList();
        for (int i = 0;i < 10;i++){
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        System.out.println("——————————");
        System.out.println(myArrayList1.search(5));
    }


}
