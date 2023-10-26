package pl.hajduk.task10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoveDirection {
    double x;
    double y;

    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }
}