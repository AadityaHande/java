import javax.swing.*;

public class P4 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField t = new JTextField();

        t.setBounds(50, 50, 150, 30);
        f.add(t);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}