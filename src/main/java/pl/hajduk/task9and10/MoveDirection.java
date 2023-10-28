package pl.hajduk.task9and10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoveDirection {
    private double x;
    private double y;

    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
