package day03.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("G001", "Alice", "1234567890", 500);
        SilverCard silverCard = new SilverCard("S001", "Bob", "0987654321", 300);

        Test test = new Test();

        System.out.println("----金卡用户消费----");
        test.service(goldCard);
        System.out.println("----银卡用户消费----");
        test.service(silverCard);
    }

    public void service(Card card) {
        System.out.println("请刷卡，您的消费金额为：");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        card.pay(amount);
        System.out.println("当前余额为：" + card.getMoney());
    }
}
