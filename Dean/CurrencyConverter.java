import javax.swing.*;
import java.awt.*;
import java.awt.Insets;

public class CurrencyConverter {
    public static void main(String[]args){
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setBackground(Color.BLUE);;
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets = new Insets(5,5, 5, 5);
        
        //Labels and my TextFields
        JLabel SgdCurrency = new JLabel("Singapore Dollars: ");
        JTextField  sgdCurrField =new JTextField(10);
        JLabel UsdCurrency = new JLabel("US Dollars: ");
        JTextField  usdCurrField = new JTextField(10);
        JLabel EurosCurrency = new JLabel("Euros: ");
        JTextField  euroCurrField = new JTextField(10);
        JLabel TzCurrency = new JLabel("Tanzanian Shillings: ");
        JTextField tzCurrField = new JTextField(10);
        JLabel RwandeseCurrency = new JLabel("Rwandese Francs: ");
        JTextField  rwfCurrField = new JTextField(10);
        JLabel DirhamCurrency = new JLabel("Dirhams: ");
        JTextField dirhamCurrField = new JTextField(10);
        JLabel RupeesCurrency= new JLabel("Indian Rupees: ");
        JTextField rupeeCurrField = new JTextField(10);
        JLabel YuanCurrency= new JLabel("Chinese Yuan: ");
        JTextField yuanCurrField= new JTextField(10);
        JLabel AustralianCurrency= new JLabel("Australian Dollars: ");
        JTextField austCurrField=new JTextField(10);
        JLabel CanadianCurrency= new JLabel("Canadian Dollars: ");
        JTextField canCurrField=new JTextField(10);
        JLabel BritCurrency=new JLabel("British Pounds: ");
        JTextField britCurrField=new JTextField(10);
        JLabel SterlingCurrency=new JLabel("Sterling Pounds: ");
        JTextField sterCurrField=new JTextField(10);
        JLabel SAfricaCurrency=new JLabel("South African Rands: ");
        JTextField saCurrField=new JTextField(10);
        JLabel JapanCurrency= new JLabel("Japanese Yen: ");
        JTextField japanCurrField= new JTextField(10);
        JLabel NigeriaCurrency=new JLabel("Nigerian Naira: ");
        JTextField nairaCurrField=new JTextField(10);
        JLabel GhanaCurrency=new JLabel("Ghanaian Cedis: ");
        JTextField cediCurrField=new JTextField(10);

        JButton convertButton=new JButton("CONVERT");

        //Add  to grid
        gbc.gridx=0;gbc.gridy=0;frame.add(SgdCurrency,gbc);
        gbc.gridx=1;frame.add(sgdCurrField,gbc);

        gbc.gridx=0;gbc.gridy=1;frame.add(UsdCurrency,gbc);
        gbc.gridx=1;frame.add(usdCurrField,gbc);

        gbc.gridx=0;gbc.gridy=2;frame.add(EurosCurrency,gbc);
        gbc.gridx=1;frame.add(euroCurrField,gbc);

        gbc.gridx=0;gbc.gridy=3;frame.add(TzCurrency,gbc);
        gbc.gridx=1;frame.add(tzCurrField,gbc);

        gbc.gridx=0;gbc.gridy=4;frame.add(RwandeseCurrency,gbc);
        gbc.gridx=1;frame.add(rwfCurrField,gbc);
          
        gbc.gridx=0;gbc.gridy=5;frame.add(DirhamCurrency,gbc);
        gbc.gridx=1;frame.add(dirhamCurrField,gbc);
        
        gbc.gridx=0;gbc.gridy=6;frame.add(RupeesCurrency,gbc);
        gbc.gridx=1;frame.add(rupeeCurrField,gbc);

        gbc.gridx=0;gbc.gridy=7;frame.add(YuanCurrency,gbc);
        gbc.gridx=1;frame.add(yuanCurrField,gbc);

        gbc.gridx=0;gbc.gridy=8;frame.add(AustralianCurrency,gbc);
        gbc.gridx=1;frame.add(austCurrField,gbc);

        gbc.gridx=0;gbc.gridy=9;frame.add(CanadianCurrency,gbc);
        gbc.gridx=1;frame.add(canCurrField,gbc);

        gbc.gridx=0;gbc.gridy=10;frame.add(BritCurrency,gbc);
        gbc.gridx=1;frame.add(britCurrField,gbc);

        gbc.gridx=0;gbc.gridy=11;frame.add(SterlingCurrency,gbc);
        gbc.gridx=1;frame.add(sterCurrField,gbc);

        gbc.gridx=0;gbc.gridy=12;frame.add(SAfricaCurrency,gbc);
        gbc.gridx=1;frame.add(saCurrField,gbc);

        gbc.gridx=0;gbc.gridy=13;frame.add(JapanCurrency,gbc);
        gbc.gridx=1;frame.add(japanCurrField,gbc);

        gbc.gridx=0;gbc.gridy=14;frame.add(NigeriaCurrency,gbc);
        gbc.gridx=1;frame.add(nairaCurrField,gbc);

        gbc.gridx=0;gbc.gridy=15;frame.add(GhanaCurrency,gbc);
        gbc.gridx=1;frame.add(cediCurrField,gbc);
         
        gbc.gridx=1;gbc.gridy=16;frame.add(convertButton,gbc);

        //Exchange Rates
        double sgdRate=1.35;
        double usdRate=1.0;
        double euroRate=0.9;
        double tzRate=2320.0;
        double rwfRate=1100.0;
        double dirhamRate=3.67;
        double rupeeRate=74.0;
        double yuanRate=6.45;
        double austRate=1.4;
        double canRate=1.25;
        double britRate=0.75;
        double sterRate=0.75;
        double saRate=14.0;
        double japanRate=110.0;
        double nairaRate=410.0;
        double cediRate=6.0;

        //Action Listener for the button
        convertButton.addActionListener(e -> {
            try {
                double sgdAmount = sgdCurrField.getText().isEmpty() ? 0 : Double.parseDouble(sgdCurrField.getText());
                double usdAmount = usdCurrField.getText().isEmpty() ? 0 : Double.parseDouble(usdCurrField.getText());
                double euroAmount = euroCurrField.getText().isEmpty() ? 0 : Double.parseDouble(euroCurrField.getText());
                double tzAmount = tzCurrField.getText().isEmpty() ? 0 : Double.parseDouble(tzCurrField.getText());
                double rwfAmount = rwfCurrField.getText().isEmpty() ? 0 : Double.parseDouble(rwfCurrField.getText());
                double dirhamAmount = dirhamCurrField.getText().isEmpty() ? 0 : Double.parseDouble(dirhamCurrField.getText());
                double rupeeAmount = rupeeCurrField.getText().isEmpty() ? 0 : Double.parseDouble(rupeeCurrField.getText());
                double yuanAmount = yuanCurrField.getText().isEmpty() ? 0 : Double.parseDouble(yuanCurrField.getText());
                double austAmount = austCurrField.getText().isEmpty() ? 0 : Double.parseDouble(austCurrField.getText());
                double canAmount = canCurrField.getText().isEmpty() ? 0 : Double.parseDouble(canCurrField.getText());
                double britAmount = britCurrField.getText().isEmpty() ? 0 : Double.parseDouble(britCurrField.getText());
                double sterAmount = sterCurrField.getText().isEmpty() ? 0 : Double.parseDouble(sterCurrField.getText());
                double saAmount = saCurrField.getText().isEmpty() ? 0 : Double.parseDouble(saCurrField.getText());
                double japanAmount = japanCurrField.getText().isEmpty() ? 0 : Double.parseDouble(japanCurrField.getText());
                double nairaAmount = nairaCurrField.getText().isEmpty() ? 0 : Double.parseDouble(nairaCurrField.getText());
                double cediAmount = cediCurrField.getText().isEmpty() ? 0 : Double.parseDouble(cediCurrField.getText());
            

                //Converting to USD first
                double totalInUsd = (sgdAmount / sgdRate) + (usdAmount / usdRate) + (euroAmount / euroRate) + (tzAmount / tzRate) +
                                   (rwfAmount / rwfRate) + (dirhamAmount / dirhamRate) + (rupeeAmount / rupeeRate) + (yuanAmount / yuanRate) +
                                   (austAmount / austRate) + (canAmount / canRate) + (britAmount / britRate) + (sterAmount / sterRate) +
                                   (saAmount / saRate) + (japanAmount / japanRate) + (nairaAmount / nairaRate) + (cediAmount / cediRate);       
                //Showing result in USD 
                
                JOptionPane.showMessageDialog(frame, String.format("Total in USD: $%.2f", totalInUsd));
                } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values only.", "Error", JOptionPane.ERROR_MESSAGE);
           
                 }

        });

        frame.setVisible(true);     



    }
    
}


