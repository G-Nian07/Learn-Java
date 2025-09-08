import java.util.Scanner;

public class Login{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("请输入账号");
            int account = sc.nextInt();

            System.out.println("请输入密码");
            int password = sc.nextInt();

            String a = account == 123456 ? "是" : "否";
            String b = password == 234567 ? "是" : "非";

            String c = a == b ? "登录成功" : "账号或密码错误";

            System.out.println(c);
        }
    }
}