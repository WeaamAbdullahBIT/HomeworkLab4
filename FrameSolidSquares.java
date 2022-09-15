import javax.swing.*;

public class FrameSolidSquares {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,350);
        frame.setTitle("Two Solid Squares ");
        frame.setVisible(true);
        ComponentSolidSquares component= new ComponentSolidSquares();
        frame.add(component);

    }
}
