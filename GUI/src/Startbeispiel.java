import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startbeispiel extends JFrame {
    private JLabel Vorname;
    private JTextField fieldVorname;
    private JLabel Nachname;
    private JTextField fieldNachname;
    private JButton Text;
    private JButton button1;
    private JTextField fieldAusgabe;
    private JPanel panelMain;
    private String text;

    public Startbeispiel() {
        this.setTitle("Startbeispiel");
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttontextActionPerformed(e);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonDialogActionPerformed(e);
            }
        });
    }


    private void buttontextActionPerformed(ActionEvent e) {
        text = toString();
        fieldAusgabe.setText(text);

    }

    private void buttonDialogActionPerformed(ActionEvent e) {
        text = toString();
        JOptionPane.showMessageDialog(this, text, this.getTitle(), JOptionPane.INFORMATION_MESSAGE);

    }


    public String toString() {
        return "Moin " + fieldVorname.getText()
                + " " + fieldNachname.getText();

    }
}