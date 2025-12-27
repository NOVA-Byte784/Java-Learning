package day01; // 包声明，指定类所在的包

public class LiteralDemo { // 类定义，公共类名为LiteralDemo
    public static void main(String[] args) { // 主方法，程序入口点
        System.out.println(42);                // 输出整数字面量
        System.out.println(3.14);              // 输出浮点数字面量
        System.out.println('A');               // 输出字符字面量
        System.out.println(true);              // 输出布尔字面量
        System.out.println("Hello, literals"); // 输出字符串字面量
        System.out.println(0b1010);            // 输出二进制整数字面量（十进制为10）
        System.out.println(0xFF);              // 输出十六进制整数字面量（十进制为255）
        System.out.println(1_000_000);         // 输出带下划线的整数字面量（用于提高可读性）
        System.out.println(1.23e4);            // 输出科学计数法浮点字面量（12300.0）
        System.out.println((String) null);     // 输出null字面量，显式转换为String以避免歧义
        System.out.println(' ');               // 输出空格字符字面量
        System.out.println("abc");             // 输出字符串字面量

        // 一些特殊的字符字面量示例
        System.out.println('\n');              // 输出换行符字面量
        System.out.println('\t');              // 输出制表符字面量
        System.out.println("ab\nc");           // 输出包含换行符的字符串字面量
        System.out.println("ab\tc");           // 输出包含制表符的字符串字面量
    }
}
