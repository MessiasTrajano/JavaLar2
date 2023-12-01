package View.Create;
import javax.swing.*;

public class NewLabel extends JLabel {

    private int x;
    private int y;

    public NewLabel(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int X(){
        return x;
    }
    public int Y(){
        return y;
    }



}
