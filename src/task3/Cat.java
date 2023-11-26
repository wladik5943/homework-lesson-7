package task3;

public class Cat implements Cloneable{
    String name;
    int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(String a){
        System.out.println(a);
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        for (int i = 0; i < 30; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public Object clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Cat(this.name, this.age);
        }
    }
}
