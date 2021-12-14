package ru.ithub.practise.shop;

/**
 * @author Andrew «Fadesml» Bunyak
 */
public class ShopStarter {
    public static void main(String[] args) {
        int myBalance = 100; //наш баланс

        int milkCost = 200; //стоимость пакета молока
        int flourCost = 50; //стоимость пакета муки
        int eggCost = 10; //стоимость яйца за штуку

        int totalCost = milkCost + flourCost + (eggCost*10); //итоговая стоимость покупок (1 пакет молока, 1 упаковка муки и 10 яиц);

        if (myBalance >= totalCost) {
            System.out.println("Вы успешно купили пакет молока, упаковку муки и 10 яиц, ваша сдача: " + (myBalance - totalCost));
        } else {
            System.out.println("Ошибка - не хватает денег: " + (totalCost - myBalance));
        }
    }
}
