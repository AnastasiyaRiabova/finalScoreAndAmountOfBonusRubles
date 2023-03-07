public class Main {
    public static void main(String[] args) {
        int startingScore = 100; //начальный счет
        int replenishmentAmount = 1100; // сумма пополнения
        int bonus = 1; // количество бонусов за каждые 100 рублей
        int bonusMiles = replenishmentAmount * bonus / startingScore;// количество бонусов, которые получит клиент, за пополнение больше, чем на 1000 рублей
        int totalAmount = startingScore + replenishmentAmount + bonusMiles;// итоговая сумма
        if (replenishmentAmount > 1000) {
            bonusMiles = replenishmentAmount * bonus / startingScore;
        }else {
            bonusMiles = 0;
        }
        
        System.out.println("Количество бонусных рублей: " + bonusMiles + " руб.");
        System.out.println("Итоговая сумма: " + totalAmount + " руб.");
    }
}