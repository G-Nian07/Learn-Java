import java.util.Scanner;

public class YunsuanTest1{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("请输入一个三位整数");
            int num = sc.nextInt();

            int bai = num / 100 % 10;
            int shi = num /10 % 10;
            int ge = num % 10;

            System.out.println("百位为：" + bai);

            System.out.println("十位为：" + shi);


            System.out.println("个位为：" + ge);
        }
    }
}