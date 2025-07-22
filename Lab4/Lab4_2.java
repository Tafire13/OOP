
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Lab4_2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(8, 5));
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        for (int i = 1; i <= 20; i++) {
            Button button = new Button("Button :" + i);
            JTextArea text = new JTextArea();
            frame.add(button);
            frame.add(text);
        }
        frame.setVisible(true);
    }
}
