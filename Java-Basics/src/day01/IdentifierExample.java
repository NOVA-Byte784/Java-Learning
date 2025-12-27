package day01;

public class IdentifierExample {
    public static void main(String[] args) {
        // 什么是标识符
        // 是程序员为变量、方法、类、包等程序元素起的名字。

        // 有效的标识符示例
        int myVariable = 10;
        double _myDouble = 20.5;
        char $myChar = 'C';
        boolean isValid = true;
        String userName123 = "JohnDoe";

        // 输出标识符的值
        System.out.println("myVariable: " + myVariable);
        System.out.println("_myDouble: " + _myDouble);
        System.out.println("$myChar: " + $myChar);
        System.out.println("isValid: " + isValid);
        System.out.println("userName123: " + userName123);

        // 无效的标识符示例（注释掉以避免编译错误）
        // 例如 int, class, if, for, public, static, return 等
    }
}
