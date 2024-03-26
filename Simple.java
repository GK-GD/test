import javax.swing.*;
import java.awt.*;

public class Simple {
    JFrame f;
    Simple(){
    f = new JFrame();
    JButton b=new JButton(new ImageIcon("C:\\Users\\GKDev\\Desktop\\button.jpg"));
    b.setBounds(130,100,100,100);
    f.add(b);

    f.setSize(300,400);
    f.setLayout(null);
    f.setVisible(true);

}
    public static void main(String[] args) {

        new Simple();
        


    }

}
