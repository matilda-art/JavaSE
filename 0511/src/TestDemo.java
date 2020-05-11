import java.util.*;
/**
 * @program: 0511
 * @description
 * @author: matilda
 * @create: 2020-05-11 09:16
 **/
public class TestDemo {

    //自定义登录异常
    //实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码。
    //如果用户名密码出错, 使用自定义异常的方式来处理。
    private static String userName = "matilda";
    private static String passWord = "1234567";

    static class UserError extends Exception {
        public UserError(String message) {
            super(message);
        }
    }

    static class PasswordError extends Exception {
        public PasswordError(String message) {
            super(message);
        }
    }

    public static void login(String userName,String passWord) throws UserError, PasswordError {
        if (!TestDemo.userName.equals(userName)){
            throw new UserError("用户名错误");
        }
        if (!TestDemo.passWord.equals(passWord)){
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        try {
            login("matilda","1234567");
        }catch (UserError userError){
            userError.printStackTrace();
        }catch (PasswordError passwordError){
            passwordError.printStackTrace();
        }
    }




    private static void testMethod() {
        System.out.println("testMethod");
    }

    public static void main2(String[] args) {
        ((TestDemo) null).testMethod();
    }

    public static void main1(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("我老公", "朱一龙");
        map.put("我老婆", "石原里美");
        map.put("我", "人生赢家");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("我"));
        String s = map.getOrDefault("胡悦", "死人");
        System.out.println(s);
        System.out.println(map.containsKey("我老婆"));
        System.out.println(map.containsValue("石原里美"));

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }

}