import java.util.Scanner;

public class YunsuanTest3{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            
            //键盘录入两个数是否有一个为6或者和为6的倍数
            System.out.println("请输入第一个整数");
            int num1 = sc.nextInt();

            System.out.println("请输入第二个整数");
            int num2 = sc.nextInt();

            boolean result = num1==6 || num2 == 6 || (num1 + num2) % 6 == 0;
            System.out.println(result);
        }
    }
}