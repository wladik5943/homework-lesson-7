package task2;

import task1.Main;

import static java.lang.System.exit;

public class Triangle extends Figure {

    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("введены некоректные значения");
            exit(0);
        }
    }

    @Override
    int getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getArea() {

        int p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}
