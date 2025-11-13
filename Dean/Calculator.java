import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Calculator{
    public static void main(String[]args){
        JFrame f = new JFrame("Calculator");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        //input panel
        JPanel myPanel =new JPanel(new GridLayout(3,2,5,5));
        JTextField num1= new JTextField();
        JTextField num2= new JTextField();
        JLabel result= new JLabel("");
        myPanel.add(new JLabel("First Number: "));
        myPanel.add(num1);
        myPanel.add(new JLabel("Second Number: "));
        myPanel.add(num2);
        myPanel.add(new JLabel("Result: "));
        myPanel.add(result);
        f.add(myPanel, BorderLayout.CENTER);

        //Buttons Entity
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addition = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton square = new JButton("x^2");
        JButton  sqrt = new JButton("√x");
        JButton cube = new JButton("x^3");
        JButton cbrt = new JButton("³√x");
        JButton sin = new JButton("sin");
        JButton cos = new JButton("cos");
        JButton tan = new JButton("tan");
        JButton log = new JButton("log");
        JButton Clear = new JButton("CLEAR"); 

        //Addiny my buttons to the panel
        buttonPanel.add(addition);
        buttonPanel.add(subtract);
        buttonPanel.add(multiply);
        buttonPanel.add(divide);
        buttonPanel.add(square);
        buttonPanel.add(sqrt);
        buttonPanel.add(cube);
        buttonPanel.add(cbrt);
        buttonPanel.add(sin);
        buttonPanel.add(cos);
        buttonPanel.add(tan);
        buttonPanel.add(log);
        buttonPanel.add(Clear);
        f.add(buttonPanel, BorderLayout.SOUTH);

        //ActionLIstener 
          ActionListener operation = e -> {
            try {
                double no1 = num1.getText().isEmpty() ? 0 : Double.parseDouble(num1.getText());
                double no2 = num2.getText().isEmpty() ? 0 : Double.parseDouble(num2.getText());
                double res = 0;
                String cmd = e.getActionCommand();

                switch (cmd) {
                    case "+": res = no1 + no2; break;
                    case "-": res = no1 - no2; break;
                    case "*": res = no1 * no2; break;
                    case "/": res = no2 != 0 ? no1 / no2 : Double.NaN; break;
                    case "x^2": res = Math.pow(no1, 2); break;
                    case "√x": res = Math.sqrt(no1); break;
                    case "x^3": res = Math.pow(no1, 3); break;
                    case "³√x": res = Math.cbrt(no1); break;
                    case "sin": res = Math.sin(Math.toRadians(no1)); break;
                    case "cos": res = Math.cos(Math.toRadians(no1)); break;
                    case "tan": res = Math.tan(Math.toRadians(no1)); break;
                    case "log": res = Math.log10(no1); break;
                    case "CLEAR": num1.setText(""); num2.setText(""); result.setText(""); return;
                }
                DecimalFormat df = new DecimalFormat("#.####");
                result.setText(df.format(res));
            } catch (Exception ex) {
                result.setText("Error");
        
            };
            // Attach listener to all buttons
        
       };

       JButton[] buttons = {addition, subtract, multiply, divide, square, sqrt, cube, cbrt, sin, cos, tan, log, Clear};
        for (JButton btn : buttons) {
            btn.addActionListener(operation);
        }

       f.setVisible(true);

    }
}











