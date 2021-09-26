import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Rose extends JFrame{

    private JTextArea carea = new JTextArea();
    private JTextField cfield = new JTextField();
    private JButton b = new JButton();
    private JLabel label = new JLabel();

    Rose(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400,400);
        f.getContentPane().setBackground(Color.MAGENTA);
        f.setTitle("Rosethorn");
        f.add(carea);
        f.add(cfield);
        carea.setSize(300,310);
        carea.setLocation(1,1);
        carea.setBackground(Color.BLACK);
        cfield.setSize(300,20);
        cfield.setLocation(1,320);
        f.add(b);
        b.add(label);
        b.setSize(400,20);
        b.setLocation(300,320);

    }

}


public class Rosethorn {
    

    
  public static void main(String[] args){

    new Rose();

   }

}
