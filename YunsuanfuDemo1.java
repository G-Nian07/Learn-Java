import java.util.Scanner;

public class YunsuanfuDemo1{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("请输入第一个数字");
            int number1 = sc.nextInt();

            System.out.println("请输入第二个数字");
            int number2 = sc.nextInt();

            System.out.println("加法计算结果为：");
            System.out.println(number1 + number2);

            System.out.println("减法计算结果为；");
            System.out.println(number1 - number2);

            System.out.println("减乘法计算结果为：");
            System.out.println(number1 * number2);
        }
    }
}