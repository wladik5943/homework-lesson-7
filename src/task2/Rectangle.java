package task2;

import static java.lang.System.exit;

public class Rectangle extends Figure {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;

        if (a <= 0 || b <= 0) {
            System.out.println("введены некоректные значения");
            exit(0);
        }
    }

    @Override
    int getPerimetr() {
        return a * 2 + b * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}
