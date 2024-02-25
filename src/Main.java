public class Main {
    public static void main(String[] args) {

        System.out.println("Начальный баланс");
        int startBalance = 100;
        System.out.println("Сумма пополнения");
        int topUpAmount = 1100;
        int startBonusAmount = 1000;
        System.out.println("Сумма с которой начисляются бонусы - " + startBonusAmount);
        int bonusAmount = 1;
        int oneBonusNeedAmount = 100;
        System.out.println("За каждые " + oneBonusNeedAmount + " рублей начисляется " + bonusAmount + " бонус");

        int nowBalance = startBalance + topUpAmount;
        if (topUpAmount >= startBonusAmount) {
            nowBalance = nowBalance + (topUpAmount / oneBonusNeedAmount) * bonusAmount;
            System.out.println("Баланс после пополнения с бонусами - " + nowBalance);
        } else {
            System.out.println("Баланс после пополнения - " + nowBalance);
        }
    }
}