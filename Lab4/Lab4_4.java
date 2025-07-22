
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.TextArea;
import javax.swing.JFrame;

public class Lab4_4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Lab_4");
        frame.setLayout(new BorderLayout());
        TextArea textArea = new TextArea("", 100, 100, TextArea.SCROLLBARS_NONE);
        frame.add(textArea, BorderLayout.CENTER);
        Panel panel = new Panel();
        Panel panelWest = new Panel();
        Panel panelEast = new Panel();
        panel.setLayout(new FlowLayout());
        Button OpenFile = new Button("Open File");
        Button SaveFile = new Button("Save File");
        Button ClearScreen = new Button("Open File");
        panel.setPreferredSize(new Dimension(50, 50));
        panelWest.setPreferredSize(new Dimension(20, 20));
        panelEast.setPreferredSize(new Dimension(20, 20));
        panel.add(OpenFile);
        panel.add(SaveFile);
        panel.add(ClearScreen);
        frame.add(panel, BorderLayout.SOUTH);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelEast, BorderLayout.EAST);
        frame.setVisible(true);
    }
}
