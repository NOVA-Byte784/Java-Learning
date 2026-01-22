package day03.demo;

public class SilverCard extends Card{
    public SilverCard(String CardId, String name, String phone, double money) {
        super(CardId, name, phone, money);
    }

    @Override
    public boolean pay(double amount) {
        double discountAmount = amount * 0.9; // 享受九折优惠
        boolean flag = super.pay(discountAmount);

        return flag;
    }
}
