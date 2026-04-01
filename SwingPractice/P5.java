import javax.swing.*;
import java.awt.event.*;

public class P5 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");

        b.setBounds(100, 100, 100, 40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Clicked!");
            }
        });

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}