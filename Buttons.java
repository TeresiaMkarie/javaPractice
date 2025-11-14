//Java Program to create three buttons
//With caption OK, SUBMIT, CANCEL

import java.awt.*;

public class Buttons {

    Buttons(){

        Frame frm = new Frame();

        //Button 1 created
        //OK button
        Button b1 = new Button("OK");
        b1.setBounds(100,50,80,50);
        frm.add(b1);

       //Button 2 created
       //Submit Button
       Button b2 = new Button("SUBMIT");
       b2.setBounds(100, 120, 80, 50);
       frm.add(b2);

       //Button 3 created
       // CANCEL button
       Button b3 = new Button("CANCEL");
       b3.setBounds(100,190,80,50);
       frm.add(b3);

       frm.setSize(500,500);
       frm.setLayout(null);
       frm.setVisible(true);
    }
    public static void main(String a[]){
        new Buttons();
    }
    
}
