import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ввести начальный баланс (целое число): ");
        int startBalance = sc.nextInt();
        System.out.println("Ввести сумму пополнения (целое число): ");
        int topUpAmount = sc.nextInt();
        int startBonusAmount = 1000;
        System.out.println("Сумма с которой начисляются бонусы - " + startBonusAmount);
        int bonusAmount = 1;
        int oneBonusNeedAmount = 100;
        System.out.println("За каждые " + oneBonusNeedAmount + " рублей начисляется " + bonusAmount + " бонус");

        int nowBalance = startBalance + topUpAmount;
        if (topUpAmount >= startBonusAmount) {
            nowBalance = nowBalance + (topUpAmount / oneBonusNeedAmount) * bonusAmount;
            System.out.println("Баланс после пополнения с бонусами - " + nowBalance);
        }
        else {
            System.out.println("Баланс после пополнения - " + nowBalance);
        }
    }
}