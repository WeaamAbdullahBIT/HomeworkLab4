import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2= (Graphics2D) g;
        Rectangle box=new Rectangle(60,50,80,60);
        g2.setColor(Color.blue);
        g2.fill(box);
        g2.draw(box);
        g2.setColor(Color.red);
        g2.drawString("WEAAM",70,80);

    }
}
