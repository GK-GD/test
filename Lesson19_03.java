import javax.swing.*;
import java.awt.*;

public class Lesson19_03 {
    public static void main(String[] args) {
        JFrame f= new JFrame("My Icon Button");
        JButton btn= new JButton("click");
        JButton b=new JButton(new ImageIcon("C:\\Users\\GKDev\\Desktop\\button.jpg"));
        btn.setBackground(Color.RED);
        b.setBounds(130,50,100,100);
        btn.setBounds(130,160,100,100);


        f.add(b);
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
}
}