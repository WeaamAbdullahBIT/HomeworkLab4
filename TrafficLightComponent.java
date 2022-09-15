import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class TrafficLightComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        Rectangle trafficLight=new Rectangle(160,260);
        g2.setColor(Color.black);
        g2.fill(trafficLight);
        g2.draw(trafficLight);
        Ellipse2D.Double circlered = new Ellipse2D.Double(50,30,50,50);
        Ellipse2D.Double circlyellow = new Ellipse2D.Double(50,100,50,50);
        Ellipse2D.Double circlegreen = new Ellipse2D.Double(50,170,50,50);
        g2.setColor(Color.red);
        g2.fill(circlered);
        g2.draw(circlered);
        g2.setColor(Color.yellow);
        g2.fill(circlyellow);
        g2.draw(circlyellow);
        g2.setColor(Color.green);
        g2.fill(circlegreen);
        g2.draw(circlegreen);
    }



}
