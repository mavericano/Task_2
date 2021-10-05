package by.epamtc.gavrilovichivan;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Ball implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Color ballColor;
    private float weight;

    public Ball() {

    }

    public Ball(Color ballColor, float weight) {
        this.ballColor = ballColor;
        this.weight = weight;
    }

    public Color getBallColor() {
        return ballColor;
    }

    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ball ball = (Ball) obj;
        return Float.compare(ball.weight, weight) == 0 && ballColor == ball.ballColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballColor, weight);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                '{' +
                "color = " + ballColor +
                ", weight = " + weight +
                '}';
    }
}
