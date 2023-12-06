import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Tachenrechner extends JFrame{
    private JTextField textFieldZahl1;
    private JButton buttonMinus;
    private JButton buttonPlus;
    private JLabel Zahl1;
    private JPanel panelMain;
    private JButton buttonDivision;
    private JButton buttonMultiplikation;
    private JButton buttonNeu;
    private JButton buttonEnde;
    private JTextField textFieldAusgabe;
    private JTextField textFieldZahl2;
    private JLabel Zahl2;
    private String text;
    private DecimalFormat df = new DecimalFormat("#.###.##0.00");

    public Tachenrechner() {
        this.setTitle("Tachenrechner");
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();

        buttonPlus.addActionListener(new ActionListener() { //+
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonPlusActionPerformed(e);
            }
        });
        buttonMinus.addActionListener(new ActionListener() {//-
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonMinusActionPerformed(e);
            }
        });
        buttonDivision.addActionListener(new ActionListener() { //div
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonDivisionActionPerformed(e);
            }
        });
        buttonMultiplikation.addActionListener(new ActionListener() { //*
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonMultiplikationActionPerformed(e);
            }
        });
        buttonNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonNeuActionPerformed(e);
            }
        });
        buttonEnde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonEndeActionPerformed(e);
            }
        });
    }

    private void buttonNeuActionPerformed(ActionEvent e){
        textFieldZahl1.setText(null);
        textFieldZahl2.setText(null);
        textFieldAusgabe.setText(null);
    }

    private void buttonEndeActionPerformed(ActionEvent e){
        System.exit(0);
    }

    private void buttonPlusActionPerformed(ActionEvent e) {
        double zahl1 = Double.parseDouble(textFieldZahl1.getText().trim().replace(",","."));
        double zahl2 = Double.parseDouble(textFieldZahl2.getText().trim().replace(",","."));
        double summe = zahl1 + zahl2;
        String s = Double.toString(summe).trim().replace(".",",");
        //String s =df.format(summe);
        textFieldAusgabe.setText(s);
    }

    private void buttonMinusActionPerformed(ActionEvent e) {
        double zahl1 = Double.parseDouble(textFieldZahl1.getText().trim().replace(",","."));
        double zahl2 = Double.parseDouble(textFieldZahl2.getText().trim().replace(",","."));
        double differenz = zahl1 - zahl2;
        String s = Double.toString(differenz).trim().replace(".",",");
        textFieldAusgabe.setText(s);
    }

    private void buttonDivisionActionPerformed(ActionEvent e) {
        double zahl1 = Double.parseDouble(textFieldZahl1.getText().trim().replace(",","."));
        double zahl2 = Double.parseDouble(textFieldZahl2.getText().trim().replace(",","."));
        double quotient = zahl1 / zahl2;
        if (zahl2 == 0){
            JOptionPane.showMessageDialog(null, "Man kann mit 0 nicht dividieren!", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            String s = Double.toString(quotient).trim().replace(".",",");
            textFieldAusgabe.setText(s);
        }
    }


    private void buttonMultiplikationActionPerformed(ActionEvent e) {
        double zahl1 = Double.parseDouble(textFieldZahl1.getText().trim().replace(",","."));
        double zahl2 = Double.parseDouble(textFieldZahl2.getText().trim().replace(",","."));
        double produkt = zahl1 * zahl2;
        String s = Double.toString(produkt).trim().replace(".",",");
        textFieldAusgabe.setText(s);
    }
}
