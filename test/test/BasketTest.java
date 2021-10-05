package by.epamtc.gavrilovichivan.test;

import by.epamtc.gavrilovichivan.entity.Ball;
import by.epamtc.gavrilovichivan.entity.Basket;
import by.epamtc.gavrilovichivan.entity.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void computeTotalWeight() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        basket.add(new Ball(Color.GREEN, 9));
        float actual = 19.0f;
        float expected = basket.computeTotalWeight();

        assertEquals(expected, actual);
    }

    @Test
    public void countBlueBalls() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        basket.add(new Ball(Color.GREEN, 9));
        int actual = 1;
        int expected = basket.countBlueBalls();

        assertEquals(expected, actual);
    }
}