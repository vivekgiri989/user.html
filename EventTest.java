import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Gui extends JFrame implements ActionListener {
    JButton btn = new JButton("RED");
    JButton btn1 = new JButton("GREEN");
    JButton btn2 = new JButton("BLUE");
    JButton btn3 = new JButton("YELLOW");
    Container c;

    Gui() {
        c = this.getContentPane();
        c.setLayout(null);
        btn.setBounds(200, 200, 200, 40);
        btn.addActionListener(this);

        btn1.setBounds(200, 300, 200, 40);
        btn1.addActionListener(this);

        btn2.setBounds(200, 400, 200, 40);
        btn2.addActionListener(this);

        btn3.setBounds(200, 500, 200, 40);
        btn3.addActionListener(this);

        c.add(btn);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            c.setBackground(Color.RED);
        }
        if (e.getSource() == btn1) {
            c.setBackground(Color.GREEN);
        }
        if (e.getSource() == btn2) {
            c.setBackground(Color.BLUE);
        }
        if (e.getSource() == btn3) {
            c.setBackground(Color.YELLOW);
        }

    }

}

public class EventTest {

    public static void main(String[] args) {

        Gui f = new Gui();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(500, 100, 800, 600);
        f.setTitle(" My First Window");
        f.setVisible(true);

    }
}
