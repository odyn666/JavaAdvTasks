package pl.hajduk.task9;

import lombok.Getter;
import lombok.Setter;
import pl.hajduk.task10.Movable;
import pl.hajduk.task10.MoveDirection;

@Getter
@Setter
public class Point2D implements Movable{


    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void move(MoveDirection moveDirection) {
        x += moveDirection.getX();
        y += moveDirection.getY();
    }

}
