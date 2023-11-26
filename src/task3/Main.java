package task3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("murka",3);
        Cat cat1 = new Cat("murzik",8);

        cat.display();
        cat1.display();


        cat1 = (Cat)cat.clone();

        cat.display();
        cat1.display();

    }
}
