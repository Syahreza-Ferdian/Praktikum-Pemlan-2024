package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing extends JFrame {
    JButton btn = new JButton("Click me");
    
    public Swing() {
        setLayout(null);
        add(btn);
        btn.setBounds(100, 100, 100, 30);
        btn.addActionListener(e -> {
            Overlay overlay = new Overlay();
            overlay.setSize(300, 250);
            overlay.setVisible(true);
        });
    }

    public static void main(String[] args) {
        Swing frame = new Swing();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Overlay extends JFrame {
    JButton btn = new JButton("OK");

    public Overlay() {
        setLayout(null);
        add(btn);
        btn.setBounds(100, 100, 100, 30);
    }
}