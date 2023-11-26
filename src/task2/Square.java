package task2;
import static java.lang.System.exit;
public class Square extends Figure{
    int a;

    public Square(int a) {
        this.a = a;

        if(a<=0){
            System.out.println("введены некоректные значения");
            exit(0);
        }
    }

    @Override
    public int getPerimetr(){
        return a*4;
    }

    @Override
    public double getArea(){
        return a*a;
    }
}
