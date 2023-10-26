package pl.hajduk.task9;

import lombok.Getter;
import pl.hajduk.task10.Movable;
import pl.hajduk.task10.MoveDirection;

@Getter
public class Point2D implements Movable {


    double x;
    double y;

    @Override
    public void move(MoveDirection moveDirection) {
        x+= moveDirection.getX();
        y+= moveDirection.getY();
    }
}
