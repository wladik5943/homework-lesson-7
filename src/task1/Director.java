package task1;

public class Director implements show{
    String job = "director";

    @Override
    public void display(){
        System.out.println(job);
    }
}
