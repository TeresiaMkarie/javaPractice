//Java Swing  Program to Add CheckBox
//in the Frame
 
import java.awt.*;

//Driver Class
public class Lan {
    Lan(){
        //Frame Created
        Frame f = new Frame();

        Label lb1 =  new Label("Select Known Languages");

        lb1.setBounds(100,50,160,80);
        f.add(lb1);

        //CheckBox created
        Checkbox c1 = new Checkbox("Hindi");
        c1.setBounds(100, 120, 80,50);
        f.add(c1);

        //CheckBox created
        Checkbox c2 = new Checkbox("English");
        c2.setBounds(100,150,80,50);
        f.add(c2);

        //CheckBox created
        Checkbox c3 = new Checkbox("Dutch");
        c3.setBounds(100,180,80,50);
        f.add(c3);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    
   
    }
    public static void main(String ar[]){
       new Lan();
    }
    
}
