package View.Sistem;

import Control.GeneralControl;
import View.ChoiceButtons.SelectedButton;
import View.Create.NewButton;
import Model.Files.ReadFiles;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons extends JPanel implements ActionListener {
    private NewButton button;
    private NewButton button1;
    private NewButton button2;
    private NewButton button3;
    private NewButton button4;

    private static int cont = 0;
    public MyButtons(){

        createButtons();
        actionButtons();
    }

    private void createButtons() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(false);


        button = new NewButton("Processar Instante");
        button1 = new NewButton("Ler novo arquivo de entrada");
        button2 = new NewButton("Gravar relatorio");
        button3 = new NewButton("Ler dados de Participantes");
        button4 = new NewButton("Salvar arquivo de saida");

        add(button);
        add(button1);
        add(button2);
        add(button3);
        add(button4);




        setBorder(new LineBorder(Color.black, 1));
    }
    private void actionButtons(){
        button.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cont += 1;
                new GeneralControl(cont);
                System.out.println(cont);
            }
        });

        button1.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SelectedButton();
            }
        });
        button2.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oloko");
                cont += 1;
            }
        });
        button3.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oloko");
                cont += 1;
            }
        });
        button4.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"oloko");
                cont += 1;
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static int getCont() {
        return cont;
    }
}
