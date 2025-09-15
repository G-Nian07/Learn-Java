public class  VariableDemo2{
    //主入口
    public static void main(String [] args){
        //1.基本用法
        //定义变量，再进行输出
        int a = 10;
        System.out.println(a);

        //2.变量参与运算
        int b = 10;
        int c = 20;
        System.out.println(b + c);

        //3.修改变量的值
        a = 50;
        System.out.println(a);
        System.out.println("-----------------------");

        //注意事项
        //在一条语句中可以定义多个变量
        int d =100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //变量在使用之前必须要进行赋值
        //int g;
        //g=500;
        //System.out.println(g);
        //定义变量的时候直接赋值，尽量避免如上分开写
    }
}