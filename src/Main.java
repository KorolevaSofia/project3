public class Main {
    public static void main(String[] args) {
        int a = 150; //Сумма на счете
        int b = 1350;//Сумма пополнения
        int c; //Количество бонусных рублей
        int d;//Итоговый счет
        if (b > 1000) { c = b/100; } else {
            c = 0;}
        d = a + b + c;
        System.out.print("Количество бонусных рублей = ");
        System.out.println(c);
        System.out.print("Итоговый счет = ");
        System.out.print(d);

    }
}