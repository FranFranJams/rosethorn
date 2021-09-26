import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        f.getContentPane().setBackground(new Color(75,0,130));
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
        label.setText("Send");
        b.setSize(400,20);
        b.setLocation(300,320);

        b.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(e.getSource() == b) {
        			
        			String text = cfield.getText().toLowerCase();
        			carea.setForeground(Color.GREEN);
        			
        			carea.append("You: "+text+"\n");
        			cfield.setText("");
        			
        			if(text.contains("hi")) {
        				replyMethod("Hello there!");
        			}
        			else if(text.contains("how are you")) {
        				replyMethod("I'm a bot, I don't have feelings,\nbut if I did I suppose I would be 'good'.");
        			}
        			else if(text.contains("name")) {
        				replyMethod("My name is Rose :D");
        			}
        			else if(text.contains("gender")) {
        				replyMethod("I'm Female but don't try and flirt with me :)");
        			}
        			else
        				replyMethod("I don't know what you said, sorry.");
        		}
        		        		
        	}
        });
        
    }
    public void replyMethod(String s) {
    	carea.append("Rose: "+s+"\n");
    }

}


public class Main {
    

    
  public static void main(String[] args){

    new Rose();

   }

}
