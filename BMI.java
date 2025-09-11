import java.util.Scanner;

public class BMI{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("请输入您的身高");
            double 身高 = sc.nextDouble();

            System.out.println("请输入您的体重");
            double 体重 = sc.nextDouble();

            System.out.println("您的BMI为");
            double a = (体重 / 身高 / 身高);
            System.out.println(a * 10000);
        }
    }
}