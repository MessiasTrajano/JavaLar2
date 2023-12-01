package View.ChoiceButtons;

import Control.GeneralControl;
import View.Create.NewButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedButton extends JFrame {

    private JPanel panel;
    private NewButton button;
    private NewButton button1;
    private NewButton button2;
    private NewButton button3;
    private NewButton button4;
    private NewButton button5;
    private NewButton button6;
    public SelectedButton(){
        configPanel();
        actionButtons();
        configFrame();

    }
    public void configFrame(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
    public void configPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));
        createButtos(panel);


    }
    public void createButtos(JPanel panel){
        button = new NewButton("File_10");
        button1 = new NewButton("File_50");
        button2 = new NewButton("File_100");
        button3 = new NewButton("File_500");
        button4 = new NewButton("File_1000");
        button5 = new NewButton("File_1500");
        button6 = new NewButton("File_2000");

        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);

    }
    private void actionButtons() {
        button.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(button.getName());
                GeneralControl.archive = button.getName();

                dispose();
            }
        });
        button1.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralControl.archive = button1.getName();
                dispose();
            }
        });
        button2.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralControl.archive = button2.getName();
                dispose();
            }
        });
        button3.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralControl.archive = button3.getName();
                dispose();
            }
        });
        button4.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralControl.archive = button4.getName();
                dispose();
            }
        });
        button5.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralControl.archive = button5.getName();
                dispose();
            }
        });
        button6.getButt().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralControl.archive = button6.getName();
                dispose();
            }
        });
    }

}
