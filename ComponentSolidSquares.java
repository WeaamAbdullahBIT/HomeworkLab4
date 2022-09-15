import javax.swing.*;
import java.awt.*;

public class ComponentSolidSquares extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 =(Graphics2D) g;
        Rectangle box1= new Rectangle(20,20,50,50);
        g2.setColor(Color.pink);
        g2.fill(box1);
        g2.draw(box1);
        //box1.translate(10,100);
        Rectangle box2= new Rectangle(30,30,50,50);
        box2.translate(30,60);
        //Color  magenta= new Color(255, 0, 255);
        g2.setColor(Color.magenta);
        g2.fill(box2);
        g2.draw(box2);

    }
}
