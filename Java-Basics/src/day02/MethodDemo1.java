package day02;

public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(10, 3));
        byte a = 10;
        print(a);   // 自动类型转化，byte自动转化为int

        System.out.println("------------------");
        int b = 10;
        byte c = (byte) b;   // 强制类型转化，int强制转化为byte
        print2(c);

    }

    // 定义一个方法，求任意两个数字的和
    public static int sum(int a, int b) {
        return a + b;
    }

    // 自动类型转化
    public  static void print(int b){
        System.out.println(b);
    }

    // 强制类型转化
    public static void print2(byte c){
        System.out.println(c);
    }

}

