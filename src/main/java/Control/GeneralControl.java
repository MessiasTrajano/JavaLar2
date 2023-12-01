package Control;

import Control.Entities.Components.Coordinates;
import Model.Files.ReadFiles;
import View.Sistem.MyUniverse;


import java.util.List;

public class GeneralControl {
    private MyUniverse universe;
    public static String archive;
    private CreateMove cMove;

    private ReadFiles rFiles;
    private List<Coordinates> coordinates;
    public GeneralControl(int line){
        rFiles = new ReadFiles(archive, line);
        cMove = new CreateMove(rFiles.getInfo());
        updateUniverse();
    }

    public GeneralControl(){}

    private void updateUniverse(){
        universe = new MyUniverse();
        universe.updateUniverse(cMove.getPlanets(),coordinates);
        universe.revalidate();
        universe.repaint();
    }

}
