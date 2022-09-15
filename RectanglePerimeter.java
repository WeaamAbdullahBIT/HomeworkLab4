import java.awt.*;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Rectangle x=new Rectangle(5,5);
        x.getWidth();
        x.getHeight();
        double perimerter = 2*(x.getWidth()* x.getHeight());
        System.out.println(perimerter);
    }
}
