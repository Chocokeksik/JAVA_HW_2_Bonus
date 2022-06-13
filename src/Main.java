public class Main {
    public static void main(String[] args) {

        int account = 663;
        int step = 100;
        int cash = 900;
        int bonus = cash / step;

        if (cash >= 1000) {
            cash = cash;
        } else {
            bonus = 0;
        }

        int total = account + cash + bonus;

        System.out.println("Сумма на вашем счёте, после пополнения составила: " + total);


    }
}
