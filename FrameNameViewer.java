import javax.swing.*;

public class FrameNameViewer {
    public static void main(String[] args) {
        JFrame Name=new JFrame();
        Name.setTitle("MY NAME");
        Name.setSize(500,350);
        Name.setVisible(true);
        NameComponent component1=new NameComponent();
        Name.add(component1);
    }
}
