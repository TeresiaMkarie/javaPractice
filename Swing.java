
import javax.swing.*;
import java.awt.*;

public class Swing {

    public static void main(String []args){

        //An instance of a JFrame
        JFrame frame = new JFrame();
        frame.setTitle("My Title"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevents the frame from being resized
        frame.setSize(500,500); //sets the with and height of the frame
        frame.setVisible(true); //makes the frame visible
    
        //Create an ImageIcon
        ImageIcon image = new ImageIcon("apple.jpg");
        frame.setIconImage(image.getImage()); //Changes the icon of the frame
        frame.getContentPane().setBackground(new Color(0xad56ff)); //change color of backkground

    }

    
}
    

