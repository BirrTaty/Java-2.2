import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int moneyOnTheAccount = 100;
        int refill = 900;
        int account = moneyOnTheAccount + refill;
        int bonus;

        if (account >= 1000) {
            bonus = account / 100;
        } else {
            bonus = 0;
        }
        int totalAccount = account + bonus;
        System.out.println("Итоговый счет: " + totalAccount);
        System.out.println("Количество бонусов: " + bonus);

    }

}
