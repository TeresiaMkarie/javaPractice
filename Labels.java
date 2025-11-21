import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels{

  public static void main(String[] args){

    //JLabel = a GUI display area for a string of text, an image, or both
 
    Border  border = BorderFactory.createLineBorder(Color.BLACK,1);

    JLabel label = new JLabel(); // create a label
    label.setText("My Code"); //set text of label
    label.setHorizontalTextPosition(JLabel.CENTER);                      
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(0x11ff33)); //sets color of text
    label.setFont(new Font("LORA", Font.PLAIN, 20)); //sets font of text
    label.setIconTextGap(25); 
    label.setBackground(new Color(0x1f87fc));
    label.setOpaque(true); //displays background color
    label.setBorder(border);
    label.setBackground(Color.red);
    label.setVerticalAlignment(JLabel.TOP);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(0, 0, 100, 100);
    


   JFrame frame = new JFrame();
   frame.setTitle("Labels");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(400,400);
   frame.setLayout(null);
   frame.setVisible(true);
   frame.add(label);
   frame.setResizable(false);
    



   

 }

}

    

