package ru.ithub.practise.shop;

import ru.ithub.practise.shop.entity.Egg;
import ru.ithub.practise.shop.entity.Flour;
import ru.ithub.practise.shop.entity.Milk;

/**
 * @author Andrew «Fadesml» Bunyak
 */
public class ShopStarter {
    public static void main(String[] args) {
        int myBalance = 1000; //наш баланс

        Milk milk = new Milk(1); // продукт "молоко"
        Flour flour = new Flour(2); //продукт "мука"
        Egg egg = new Egg(10); //продукт "яиц"

        double totalCost = milk.getTotalCost() + flour.getTotalCost() + egg.getTotalCost(); //итоговая стоимость покупок (1 пакет молока, 2 упаковки муки и 10 яиц);

        if (myBalance >= totalCost) {
            System.out.println("Вы успешно купили пакет молока, 2 упаковки муки и 10 яиц, ваша сдача: " + (myBalance - totalCost));
        } else {
            System.out.println("Ошибка - не хватает денег: " + (totalCost - myBalance));
        }
    }
}
