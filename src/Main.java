public class Main {
    public static void main(String[] args) {
        int ticketPrice = 27891; //стоимость билета
        int bonusMile = 20; //рублей для одной бонусной мили
        int totalBonusMile = ticketPrice / bonusMile; //итоговая сумма бонусных миль

        System.out.println(totalBonusMile + " бонусных миль");


    }
}
