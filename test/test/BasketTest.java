package test;

import by.epamtc.gavrilovichivan.entity.Ball;
import by.epamtc.gavrilovichivan.entity.Basket;
import by.epamtc.gavrilovichivan.entity.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void get_Out_Of_Bounds() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        basket.add(new Ball(Color.GREEN, 9));

        try {
            basket.get(4);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void computeTotalWeight_Not_Null() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        basket.add(new Ball(Color.GREEN, 9));
        float actual = basket.computeTotalWeight();
        float expected = 19.0f;

        assertEquals(expected, actual);
    }

    @Test
    public void computeTotalWeight_Has_Null() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        try {
            basket.add(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        float actual = basket.computeTotalWeight();
        float expected = 10.0f;

        assertEquals(expected, actual);
    }

    @Test
    public void countBlueBalls_Not_Null() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        basket.add(new Ball(Color.GREEN, 9));
        int actual = basket.countBlueBalls();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void countBlueBalls_Has_Null() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.RED, 2));
        basket.add(new Ball(Color.BLUE, 8));
        try {
            basket.add(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        int actual = basket.countBlueBalls();
        int expected = 1;

        assertEquals(expected, actual);
    }
}