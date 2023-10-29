package pl.hajduk.task9and10;

import lombok.Getter;

//Następnie stwórz klasę Circle, która będzie
// miała konstruktor: Circle(Point2D center, Point2D point)
//Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu.
// Na podstawie tych punktów, klasa Circle ma określać:
//• promień okręgu przy wywołaniu metody double getRadius()
//• obwód okręgu przy wywołaniu metody double getPerimeter()
//• pole okręgu przy wywołaniu metody double getArea()
//• (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()
public class Circle implements Movable, Resizable {
    @Getter
    private final Point2D center;
    @Getter
    private Point2D point;

    public Circle(Point2D center, Point2D point) {

        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        double dx = center.getX() - point.getX();
        double dy = center.getY() - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();

    }

    public double getArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }


    @Override
    public void resize(double factor) {
        center.setX(center.getX() * factor);
        center.setY(center.getY() * factor);

        point.setX(center.getX() * factor);
        point.setY(center.getY() * factor);
    }
}
