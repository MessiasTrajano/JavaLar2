package View.Create;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class NewButton extends JPanel {
    private JButton butt;
    public NewButton(String text){
        configPanel(text);
        configButton(text);

        add(butt);
    }
    private void configButton(String text){
        butt = new JButton();

        butt.setText(text);
        butt.setFont(new Font("Arial", Font.BOLD, 16));
        butt.setForeground(Color.WHITE);
        butt.setFocusPainted(false);
        butt.setSize(300,20);
        butt.setContentAreaFilled(false);
        butt.setOpaque(false);
        butt.setBorderPainted(false);
        butt.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }
    private void configPanel(String text){

        setLayout(new BorderLayout());
        setVisible(true);
        setName(text);
        setPreferredSize(new Dimension(300,120));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
       //setBorder(new LineBorder(Color.BLACK, 1));
        setOpaque(false);


    }

    public JButton getButt() {
        return butt;
    }
}
