package pl.hajduk.task9and10;

public class Task10Main {


    public static void main(String[] args) {
        Point2D point = new Point2D(2.0, 3.0);
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");

        // Tworzenie obiektu Circle
        Circle circle = new Circle(new Point2D(0.0, 0.0), new Point2D(5.0, 0.0));
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle area: " + circle.getArea());

        // Przesunięcie obiektów
        MoveDirection moveDir = new MoveDirection(1.0, 2.0);
        point.move(moveDir);
        circle.move(moveDir);

        System.out.println("New Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
        System.out.println("New Circle coordinates: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");


    }


}
