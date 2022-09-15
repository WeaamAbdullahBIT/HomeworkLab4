import javax.swing.*;

public class FrameTrafficLight {
    public static void main(String[] args) {
        JFrame Traffic=new JFrame();
        Traffic.setTitle("Traffic Light");
        Traffic.setSize(250,350);
        Traffic.setVisible(true);
        TrafficLightComponent tlight =new TrafficLightComponent();
        Traffic.add(tlight);
    }
}
