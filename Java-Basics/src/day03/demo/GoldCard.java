package day03.demo;



public class GoldCard extends Card {

    public GoldCard(String CardId, String name, String phone, double money) {
        super(CardId, name, phone, money);
    }

    @Override
    public boolean pay(double amount) {
        double discountAmount = amount * 0.8; // 享受八折优惠
        boolean flag = super.pay(discountAmount);

        if(discountAmount>=200 && flag){
            System.out.println("洗车票");
        }
        else{
            System.out.println("无洗车票");
        }
        return flag;
    }



}
