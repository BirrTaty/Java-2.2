import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int moneyOnTheAccount =100;
        int refill = 2000;
        int account = moneyOnTheAccount + refill;
        int bonus;

        System.out.println("Итоговый счет: " + account);

        if (account > 1000) {
            bonus = account/100;
        }else {
            bonus = 0;
        }
        System.out.println("Количество бонусов: " + bonus);

    }

}
