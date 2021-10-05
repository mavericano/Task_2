package by.epamtc.gavrilovichivan.runner;

import by.epamtc.gavrilovichivan.entity.Ball;
import by.epamtc.gavrilovichivan.entity.Basket;
import by.epamtc.gavrilovichivan.entity.Color;

public class Runner {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        basket.add(new Ball(Color.GREEN, 9));

        System.out.println(basket.computeTotalWeight());
        System.out.println(basket.countBlueBalls());
    }
}
