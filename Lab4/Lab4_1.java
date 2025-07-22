
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Lab4_1 {

    public JFrame frame;

    public static void main(String[] args) {
        JFrame frame = createFrame();
        createButton(frame);
        frame.setVisible(true);
    }

    public static JFrame createFrame() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(5, 4));
        frame.setLocation(100, 200);
        frame.setSize(600, 600);
        return frame;
    }

    public static void createButton(JFrame frame) {
        for (int i = 1; i <= 20; i++) {
            Button button = new Button("Button : " + i);
            frame.add(button);
        }
    }
}
