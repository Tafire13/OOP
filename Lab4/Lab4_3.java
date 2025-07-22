package Lab4;

import java.awt.Button;
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;

public class Lab4_3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Multiply button");
        frame.setLayout(null);
        for (int i = 1; i <= 50; i++) {
            Button button = new Button("" + i);
            Random random = new Random();
            int x = random.nextInt(450);
            int y = random.nextInt(450);
            int r = random.nextInt(255);
            int g = random.nextInt(255);
            int b = random.nextInt(255);
            Color color = new Color(r, g, b);
            button.setBounds(x, y, 50, 50);
            button.setBackground(color);
            frame.add(button);
        }
        frame.setVisible(true);
    }
}
