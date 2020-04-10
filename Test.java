// public class Test{        
// public static void main(String[] args){                
// System.out.println("Hello,Java");        
// System.out.println("My name is:"+args[0]);    
// } 
// } 

// import java.util.Scanner; 
// Scanner sc = new Scanner(System.in); 
// System.out.println("请输入你的姓名："); 
// String name = sc.nextLine(); 
// System.out.println("请输入你的年龄："); 
// int age = sc.nextInt(); 
// System.out.println("请输入你的工资："); 
// float salary = sc.nextFloat(); 
// System.out.println("你的信息如下："); 
// System.out.println("姓名: "+name+"\n"+"年龄："+age+"\n"+"工资："+salary); 
// sc.close();

import java.util.Random; 
import java.util.Scanner;;  
class Test {  
public static void main(String[] args) {   
Random random = new Random();   
Scanner sc = new Scanner(System.in);   
int toGuess = random.nextInt(100); 
while (true) {    
System.out.println("请输入要输入的数字: (1-100)");    
int num = sc.nextInt();    
if (num < toGuess) {     
System.out.println("低了");    
} else if (num > toGuess) {     
System.out.println("高了");    
} else {     
System.out.println("猜对了");     
break;    
}   
}   
sc.close();  
}  
}