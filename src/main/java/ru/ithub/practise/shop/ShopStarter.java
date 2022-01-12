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

        Milk milk = new Milk(2.0); // продукт "молоко"
        Flour flour = new Flour(0.500); //продукт "мука"
        Egg egg = new Egg(15); //продукт "яиц"

        System.out.println("\n \n" + milk + "\n" + flour + "\n" + egg + "\n \n");

        double totalCost = milk.getTotalCost() + flour.getTotalCost() + egg.getTotalCost(); //итоговая стоимость покупок (1 литр молока, 2 с половиной кг муки и 10 яиц);

        if (myBalance >= totalCost) {
            System.out.println("Вы успешно купили 1 литр молока, 2.5 килограмма муки и 10 яиц, ваша сдача: " + (myBalance - totalCost));
        } else {
            System.out.println("Ошибка - не хватает денег: " + (totalCost - myBalance));
        }
    }
}
