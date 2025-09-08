import java.util.Scanner;

public class YunsuanTest2{
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)){

            System.out.println("请输入你的衣服时髦度");
            int Yourfashion = sc.nextInt();

            System.out.println("请输入对方衣服的时髦度");
            int Girlfashion = sc.nextInt();

            boolean result = Yourfashion >Girlfashion;
            System.out.println(result);
            
            System.out.println(Yourfashion > Girlfashion);

        }

    }
}