package task1;

import task1.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        director.display();

        Worker worker = new Worker();
        worker.display();

        Accountant accountant = new Accountant();
        accountant.display();
    }
}