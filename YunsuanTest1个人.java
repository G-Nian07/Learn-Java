import java.util.Scanner;

public class YunsuanTest1个人{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("请输入一个三位整数：");
            int num = sc.nextInt();

            System.out.println("百位为：" + num /100 % 10);

            System.out.println("十位为：" + num / 10 % 10);

            System.out.println("个位为：" + num % 10);
        }
    }
}