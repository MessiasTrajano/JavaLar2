package View.Create;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NewImage extends ImageIcon{
    static final int IMAGE_HEIGHT = 40;
    static final int IMAGE_WIDTH = 40;

    static ImageIcon imageIcon;

    public static ImageIcon newImageIcon(String file){
        imageIcon = new ImageIcon(file);
        Image resizedImage = imageIcon.getImage();
        imageIcon = new ImageIcon(resizedImage.getScaledInstance(IMAGE_WIDTH,IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        return imageIcon;
    }

    public static ImageIcon backImage(){
        BufferedImage image = null;

        try{
           image = ImageIO.read(new File("src/main/java/View/Uploads/Back.jpg"));
            Image resizedImage = image.getScaledInstance(1200, 800, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(resizedImage);
            return imageIcon;
        }catch (IOException e){
            e.printStackTrace();
        }

        return imageIcon = new ImageIcon("src/main/java/View/Uploads/Back.jpg");
    }
    public static ImageIcon JavaIcon(){
        imageIcon = new ImageIcon("src/main/java/View/Uploads/Java.png");
        Image resizedImage = imageIcon.getImage();
        imageIcon = new ImageIcon(resizedImage.getScaledInstance(IMAGE_WIDTH,IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        return imageIcon;
    }
    public static ImageIcon BugIcon(){
        imageIcon = new ImageIcon("src/main/java/View/Uploads/Bug.png");
        Image resizedImage = imageIcon.getImage();
        imageIcon = new ImageIcon(resizedImage.getScaledInstance(IMAGE_WIDTH,IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        return imageIcon;
    }
    public static ImageIcon DevIcon(){
        imageIcon = new ImageIcon("src/main/java/View/Uploads/Dev.png");
        Image resizedImage = imageIcon.getImage();
        imageIcon = new ImageIcon(resizedImage.getScaledInstance(IMAGE_WIDTH,IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        return imageIcon;
    }
    public static ImageIcon explosion(){
        imageIcon = new ImageIcon("src/main/java/View/Uploads/Explosion.png");
        Image resizedImage = imageIcon.getImage();
        imageIcon = new ImageIcon(resizedImage.getScaledInstance(IMAGE_WIDTH,IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        return imageIcon;
    }



}
