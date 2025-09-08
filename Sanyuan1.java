import java.util.Scanner;

public class Sanyuan1{
    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("请输入第一个整数");
            int weight1 = sc.nextInt();

            System.out.println("请输入第二个整数");
            int weight2 = sc.nextInt();

            String result = weight1 == weight2 ? "相同" : "不同";
            System.out.println(result);
        }
    }
}