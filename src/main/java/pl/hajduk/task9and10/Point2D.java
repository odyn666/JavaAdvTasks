package pl.hajduk.task9and10;

import lombok.Getter;
import lombok.Setter;

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
