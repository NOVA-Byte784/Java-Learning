package day03.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String CardId;
    private String name;
    private String phone;
    private double money;   //余额

    // 充值
    public void recharge(double amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("充值成功，当前余额：" + money);
        } else {
            System.out.println("充值金额必须大于0");
        }
    }

    // 消费
    public boolean pay(double amount) {
        if (amount > 0 && money >= amount) {
            money -= amount;
            return true;
        }
        else if (money<amount) {
            System.out.println("余额不足，请充值");
            return false;
        }
        else {
            System.out.println("消费金额必须大于0");
            return false;
        }
    }
}
