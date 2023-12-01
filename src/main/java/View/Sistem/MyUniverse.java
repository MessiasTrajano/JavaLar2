package View.Sistem;

import View.Create.NewImage;
import View.Create.NewLabel;
import Control.Entities.BugsDevs.BugsDevs;
import Control.Entities.Components.Coordinates;
import Control.Entities.Components.Planets;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyUniverse extends JPanel{

    private static List<NewLabel> listlabels = new ArrayList<>();
    private static List<NewLabel> usages = new ArrayList<>();
    private static List<NewLabel> devsBugs = new ArrayList<>();
    private static List<Coordinates> bugs = new ArrayList<>();
    private static List<Coordinates> devs = new ArrayList<>();
    public MyUniverse(List<Planets> planetsList){
        configPanel();
        createLabel();
        addIcons(planetsList);
        bugsDevs();
    }
    public MyUniverse(){}
    private void configPanel(){
        setLayout(new GridLayout(15,15,2,2));
        setOpaque(false);
        setBorder(new LineBorder(Color.BLACK,1));

    }
    public void updateUniverse(List<Planets> planetsList, List<Coordinates> cords){
       // deathPlanet(planetsList);
        addIcons(planetsList);
        bugsDevs();
        //setDefaultBugDevs(cords);
        deathPlanet(planetsList);

    }
    private void createLabel(){
        int a = 14;
        for (int i = 1; i < 16; i++) {
            for (int j = 5; j < 20; j++) {
                NewLabel label = new NewLabel(i + a,j);
                configLabel(label);
                add(label);
                listlabels.add(label);
            }
            a -=2;
        }

    }
    private void configLabel(NewLabel configuredLabel){

        configuredLabel.setOpaque(false);
        configuredLabel.setBorder(new LineBorder(Color.GRAY, 2));
        configuredLabel.setText("");

    }

    public void addIcons(List<Planets> planetsList){
        setDefaultLabel();

        for(NewLabel label: listlabels){
            for(Planets planets : planetsList) {
                Coordinates cords = planets.getLocation().getCoord();

                if (label.Y() == 12 && label.X() == 8) {
                    label.setIcon(NewImage.JavaIcon());
                    usages.add(label);

                } else if (cords.getY() == label.Y() && cords.getX() == label.X()) {
                    label.setIcon(planets.getImageIcon());
                    usages.add(label);
                }
            }

        }
        revalidate();
        repaint();

    }
    private void bugsDevs(){
        setBugs();
        setDevs();

    }
    private void setBugs(){
        bugs = BugsDevs.getBugs();

        for(NewLabel label : listlabels){
            for (Coordinates cord : bugs){
                if (cord.getY() == label.Y() && cord.getX() == label.X()) {
                    label.setIcon(NewImage.BugIcon());
                    devsBugs.add(label);
                }
            }
        }
    }
    private void setDevs(){
        devs = BugsDevs.getDevs();
        for(NewLabel label : listlabels){
            for (Coordinates cord : devs){
                if (cord.getY() == label.Y() && cord.getX() == label.X()) {
                    label.setIcon(NewImage.DevIcon());
                    devsBugs.add(label);
                }
            }
        }
    }
    private void setDefaultLabel(){
        for(NewLabel label : usages){
            label.setIcon(null);
        }
        usages.clear();
    }
    private void setDefaultBugDevs(List<Coordinates> cords){
        for(NewLabel label : devsBugs){
            for (Coordinates cord : cords){
                if (cord.getY() == label.Y() && cord.getX() == label.X()) {
                    label.setIcon(null);
                    devsBugs.remove(label);
                }
            }

        }

    }
    private void deathPlanet(List<Planets> planetsList){
        List<NewLabel> deaths = new ArrayList<>();

        for(NewLabel label: usages){
            for (Planets planet : planetsList) {
                Coordinates cords = planet.getLocation().getCoord();
                if (!planet.isAlive() && cords.getY() == label.Y() && cords.getX() == label.X()) {
                    deaths.add(label);
                }
            }

        }
        removeP(deaths);

    }
    private void removeP(List<NewLabel> death){
        for(NewLabel label : death){
            label.setIcon(null);
        }
    }

}
