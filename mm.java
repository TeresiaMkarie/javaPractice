import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class mm {
    public static void main(String[]args){
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(650,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets = new Insets(5,5, 5, 5);

        // Currency fields map
        Map<String, JTextField> fields = new HashMap<>();

        // Exchange Rates (relative to USD)
        Map<String, Double> rates = new HashMap<>();
        rates.put("usd", 1.0);
        rates.put("euro", 1.06);
        rates.put("Tanzanian", 0.00039);
        rates.put("ugandan", 0.00026);
        rates.put("Rwandese", 0.00079);
        rates.put("Dirhan", 0.27);
        rates.put("Rupees", 0.012);
        rates.put("Chinese Yuan", 0.14);
        rates.put("Australian Dollars", 0.64);
        rates.put("Canadian Dollar", 0.73);
        rates.put("Britih pound", 1.22);
        rates.put("Sterling pound", 1.22); // same as GBP
        rates.put("S.A rand", 0.054);
        rates.put("Japanese yen", 0.0067);
        rates.put("Nigeria Naira", 0.00063);
        rates.put("Ghanian cedis", 0.085);
        rates.put("Singapore Dollars", 0.73);

        // Labels and TextFields (exact naming)
        String[] currencyNames = {
            "usd","euro","Tanzanian","ugandan","Rwandese","Dirhan","Rupees","Chinese Yuan",
            "Australian Dollars","Canadian Dollar","Britih pound","Sterling pound",
            "S.A rand","Japanese yen","Nigeria Naira","Ghanian cedis","Singapore Dollars"
        };

        int row = 0;
        for (String c : currencyNames) {
            JLabel label = new JLabel(c + ": ");
            JTextField field = new JTextField(10);
            fields.put(c, field);

            gbc.gridx=0; gbc.gridy=row; frame.add(label, gbc);
            gbc.gridx=1; frame.add(field, gbc);

            row++;
        }

        // Buttons
        JButton convertButton=new JButton("CONVERT");
        JButton clearButton=new JButton("CLEAR");

        gbc.gridx=0; gbc.gridy=row; frame.add(convertButton,gbc);
        gbc.gridx=1; frame.add(clearButton,gbc);

        // Action Listener for Convert
        convertButton.addActionListener(e -> {
            try {
                String baseCurrency = null;
                double amount = 0;

                // find which field user entered
                for (String c : fields.keySet()) {
                    String text = fields.get(c).getText().trim();
                    if (!text.isEmpty()) {
                        baseCurrency = c;
                        amount = Double.parseDouble(text);
                        break;
                    }
                }

                if (baseCurrency == null) {
                    JOptionPane.showMessageDialog(frame, "Enter an amount in one currency field!");
                    return;
                }

                double baseRate = rates.get(baseCurrency);

                // convert to all others
                for (String c : fields.keySet()) {
                    double targetRate = rates.get(c);
                    double converted = (amount / baseRate) * targetRate;
                    fields.get(c).setText(String.format("%.2f", converted));
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values only.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Clear all fields
        clearButton.addActionListener(e -> {
            for (JTextField field : fields.values()) {
                field.setText("");
            }
        });

        frame.setVisible(true);
    }
}

    

