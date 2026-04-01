import javax.swing.*;
import java.awt.event.*;

public class ExamForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Exam Registration Form");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Roll No:");
        JLabel l3 = new JLabel("PRN No:");
        JLabel l4 = new JLabel("Gender:");
        JLabel l5 = new JLabel("Course:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField(); // PRN

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("Python");

        JButton b = new JButton("Submit");

        JLabel result = new JLabel();

        l1.setBounds(50, 30, 100, 30);
        t1.setBounds(150, 30, 120, 30);

        l2.setBounds(50, 70, 100, 30);
        t2.setBounds(150, 70, 120, 30);

        l3.setBounds(50, 110, 100, 30);
        t3.setBounds(150, 110, 120, 30);

        l4.setBounds(50, 150, 100, 30);
        r1.setBounds(150, 150, 70, 30);
        r2.setBounds(220, 150, 80, 30);

        l5.setBounds(50, 190, 100, 30);
        c1.setBounds(150, 190, 70, 30);
        c2.setBounds(220, 190, 80, 30);

        b.setBounds(100, 230, 100, 30);
        result.setBounds(50, 270, 350, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = t1.getText();
                String roll = t2.getText();
                String prn = t3.getText();

                String gender = "";
                if (r1.isSelected()) gender = "Male";
                if (r2.isSelected()) gender = "Female";

                String course = "";
                if (c1.isSelected()) course += "Java ";
                if (c2.isSelected()) course += "Python";

                result.setText("Submitted: " + name + ", " + roll + ", " + prn + ", " + gender + ", " + course);
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(l4); f.add(r1); f.add(r2);
        f.add(l5); f.add(c1); f.add(c2);
        f.add(b);
        f.add(result);

        f.setSize(400, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}