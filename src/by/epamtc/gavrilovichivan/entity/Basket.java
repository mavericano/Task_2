package by.epamtc.gavrilovichivan.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Basket implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;

    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public Basket(ArrayList<Ball> balls) {
        this.balls = new ArrayList<>(balls);
    }

    public ArrayList<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    public void setBalls(ArrayList<Ball> balls) {
        balls = new ArrayList<>(balls);
    }

    public Ball get(int i) {
        return balls.get(i);
    }

    public void add(Ball ball) {
        if (ball == null) {
            throw new IllegalArgumentException("Ball must be non-null");
        }
        balls.add(ball);
    }

    public void remove(int i) {
        balls.remove(i);
    }
    public void remove(Ball ball) {
        balls.remove(ball);
    }

    public float computeTotalWeight() {
        float totalWeight = 0;

        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }

        return totalWeight;
    }

    public int countBlueBalls() {
        int amount = 0;

        for (Ball ball : balls) {
            if (ball.getBallColor() == Color.BLUE) {
                amount++;
            }
        }

        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "balls=" + balls +
                '}';
    }
}
