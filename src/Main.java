public class Main {
    public static void main(String[] args) {
        int check = 150; //Сумма на счете
        int sum = 1350;//Сумма пополнения
        int bonus; //Количество бонусных рублей
        int result;//Итоговый счет
        if (sum > 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        result = check + sum + bonus;
        System.out.print("Количество бонусных рублей = ");
        System.out.println(bonus);
        System.out.print("Итоговый счет = ");
        System.out.print(result);

    }
}