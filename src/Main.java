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
        			else if(text.contains("i'm gay")) {
        				replyMethod("I'm so proud of you for coming out! *headpats*");
        			}
        			else if(text.contains("i'm bi")) {
        				replyMethod("I'm so proud of you for coming out! *headpats*");
        			}
        			else if(text.contains("i'm pan")) {
        				replyMethod("I'm so proud of you for coming out! *headpats*");
        			}
        			else if(text.contains("i'm trans")) {
        				replyMethod("I'm so proud of you for coming out! *headpats*");
        			}
        			else if(text.contains("i'm straight")) {
        				replyMethod("Well..um..good for you :) *awkward headpats*");
        			}
        			else {
    					int rand = (int)(Math.random()*3+4);
    					if(rand == 1) {
    					replyMethod("Could you repeat that?");
    					} else if(rand == 1) {
    					replyMethod("What?");
    					} else if(rand == 2) {
    					replyMethod("Speak English please..");
    					}
        				else if(rand == 3) {
    					replyMethod("Huh?");
    					}
        				else if(rand == 4) {
        				replyMethod("Me no understando");
        				}
        				else if(rand == 5) {
        				replyMethod("Wow.. so cool :)");
        				}
        				else if(rand == 6) {
        				replyMethod("*listens intensly* Tell me more..");
        				}
        				else if(rand == 7) {
        				replyMethod("I'm so proud of you for.. whatever you said..");
        				}
    					
    					
    				}
        			//else
        				
        				//replyMethod("I don't know what you said, sorry.");
        		}
        		        		
        	}
        });
        
    }
    private String getRandomResponse() {
  	  final int NUMBER_OF_RESPONSES = 3;
  	  double r = Math.random();
  	  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  	  String response = "";
  	  
  	  if (whichResponse == 0) {
  		  response = "Hmm.. cool, tell me more";
  	  }
  	  else if(whichResponse == 1) {
  		  response = "ReallY? Woooow..";
  	  }
  	return response;
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

