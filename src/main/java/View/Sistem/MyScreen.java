package View.Sistem;

import Control.CreateMove;
import View.Create.NewImage;

import javax.swing.*;
import java.awt.*;

public class MyScreen extends JFrame {

    private final MyUniverse myUniverse;
    public MyScreen(){
        myUniverse = new MyUniverse(CreateMove.planets);
        configFrame();
        setVisible(true);
    }
    private void configFrame(){
        backgroundImage();
        setSize(1200,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(myUniverse);
        add(new MyButtons(), BorderLayout.EAST);
    }
    private void backgroundImage(){
        setContentPane(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Image backgroundImage = NewImage.backImage().getImage();

                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        });
    }
}
