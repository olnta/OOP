import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taxi extends JFrame{
    private JButton buttonNeu;
    private JButton ButtonEnde;
    private JButton ButtonDrucken;
    private JButton buttonBerechnen;
    private JLabel Auswahl;
    private JLabel Entfernung;
    private JTextField textFieldEntfernung;
    private JCheckBox checkBoxNachtfahrt;
    private JCheckBox checkBoxKindersitz;
    private JCheckBox checkBoxBar;
    private JLabel Fahrgäste;
    private JTextField textFieldFahrgastEingabe;
    private JComboBox<String> comboBoxAuswahl;
    private JLabel Netto;
    private JLabel MWS;
    private JTextField textFieldNettobetrag;
    private JTextField textFieldMehrwertsteuer;
    private JPanel panelMain;
    private JLabel Brutto;
    private JTextField textFieldBruttobetrag;

    private void intiComboBoxBeispiel(){
        comboBoxAuswahl.removeAllItems();
        comboBoxAuswahl.addItem("Normale Taxi");
        comboBoxAuswahl.addItem("Großraumtaxi");
        comboBoxAuswahl.addItem("Strechlimousine");
    }
    public Taxi() {
        this.setTitle("Taxi");
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        intiComboBoxBeispiel();
        comboBoxAuswahl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textFieldEntfernung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textFieldFahrgastEingabe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBoxNachtfahrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBoxKindersitz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBoxBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonBerechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ButtonDrucken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonNeuActionPerformed(e);
            }
        });
        ButtonEnde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonEndeActionPerformed(e);
            }
        });
    }

    private void buttonNeuActionPerformed(ActionEvent e){
        textFieldEntfernung.setText(null);
        textFieldFahrgastEingabe.setText(null);
        textFieldNettobetrag.setText(null);
        textFieldBruttobetrag.setText(null);
        textFieldMehrwertsteuer.setText(null);
        checkBoxNachtfahrt.setSelected(false);
        checkBoxKindersitz.setSelected(false);
        checkBoxBar.setSelected(false);
        comboBoxAuswahl.setSelectedItem("Normale Taxi");
    }

    private void buttonEndeActionPerformed(ActionEvent e){
        System.exit(0);
    }

}

