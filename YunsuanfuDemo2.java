import java.util.Scanner;

public class YunsuanfuDemo2{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("请输入第一个数字");
            int num1 = sc.nextInt();

            System.out.println("请输入第二个数字");
            int num2 = sc.nextInt();

            System.out.println("除法计算结果为；");
            System.out.println(num1 / num2);

            System.out.println("取模/余的结果为；");
            System.out.println(num1 % num2);
        }
    }
}