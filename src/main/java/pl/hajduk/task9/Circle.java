package pl.hajduk.task9;

import pl.hajduk.task10.Movable;
import pl.hajduk.task10.MoveDirection;

//Następnie stwórz klasę Circle, która będzie
// miała konstruktor: Circle(Point2D center, Point2D point)
//Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu.
// Na podstawie tych punktów, klasa Circle ma określać:
//• promień okręgu przy wywołaniu metody double getRadius()
//• obwód okręgu przy wywołaniu metody double getPerimeter()
//• pole okręgu przy wywołaniu metody double getArea()
//• (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()
public class Circle implements Movable {
    Point2D center;
    Point2D point;

    public Circle(Point2D center, Point2D point) {

        this.center = center;
        this.point = point;
    }

    double getRadius() {
        double dx = center.getX() - point.getX();
        double dy = center.getY() - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    double getPerimeter() {
        return 2 * Math.PI * getRadius();

    }

    double getArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }
}
