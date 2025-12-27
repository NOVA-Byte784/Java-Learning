package day01;

public class variable {
    public static void main(String[] args) {
        // 变量声明和初始化
        int myNumber = 10;               // 整型变量
        double myDouble = 3.14;         // 浮点型变量
        char myChar = 'A';              // 字符型变量
        boolean myBoolean = true;       // 布尔型变量
        String myString = "Hello, Java"; // 字符串变量

        // 输出变量值
        System.out.println("Integer: " + myNumber);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        // 变量的重新赋值
        myNumber = 20;
        myDouble = 6.28;
        myChar = 'B';
        myBoolean = false;
        myString = "Hello, World";

        // 输出重新赋值后的变量值
        System.out.println("Updated Integer: " + myNumber);
        System.out.println("Updated Double: " + myDouble);
        System.out.println("Updated Character: " + myChar);
        System.out.println("Updated Boolean: " + myBoolean);
        System.out.println("Updated String: " + myString);

        // 字符二进制
        char ch = 'A';
        int ascii = (int) ch; // 强制类型转换为整数以获取ASCII值
        System.out.println("Character: " + ch + ", ASCII: " + ascii);   // 输出字符及其ASCII值
        System.out.println(ch+1);       // 输出66

        // 8种基本数据类型的定义
        byte byteVar = 100;             // 8位有符号整数
        short shortVar = 10000;         // 16位有符号整数
        int intVar = 100000;            // 32位有符号整数

        long longVar = 100000L;         // 64位有符号整数
        // long longVar2 = 1000000000000;     // 报错，默认是int类型，超出范围需要加L

        float floatVar = 10.5f;         // 32位单精度浮点数
        double doubleVar = 20.99;       // 64位双精度浮点数

        // 默认是double类型，float需要加f或F后缀
        // float floatVar2 = 10.5;          // 报错，需加f或F后缀

        char charVar = 'C';             // 16位Unicode字符
        boolean booleanVar = false;     // 布尔值
    }
}
