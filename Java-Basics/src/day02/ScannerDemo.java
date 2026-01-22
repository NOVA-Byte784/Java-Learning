package day02;

import java.util.Scanner;

public class ScannerDemo {
    public  static void main(String[] args) {

    }

    public static void Scannerin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("你输入的整数是：" + num);
    }

}
