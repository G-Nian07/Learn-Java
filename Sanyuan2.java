import java.util.Scanner;
public class Sanyuan2{
    public static void main(String[] atgs){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("请输入第一个整数");
            int num1 = sc.nextInt();

            System.out.println("请输入第二个整数");
            int num2 = sc.nextInt();

            System.out.println("请输入第三个整数");
            int num3 = sc.nextInt();

            int a = num1 >= num2 ? num1 : num2;
            int b = a >= num3 ? a : num3;

            System.out.println("三个整数的最大值为" + b);
        } 
    }
}