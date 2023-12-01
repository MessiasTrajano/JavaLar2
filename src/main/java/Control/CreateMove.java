package Control;

import Control.Entities.BugsDevs.BugsDevs;
import Control.Entities.Components.Planets;
import Control.Entities.Planets.*;

import java.util.ArrayList;
import java.util.List;

public class CreateMove {
    public static List<Planets> planets = planetsL();
    private BugsDevs createBD = new BugsDevs();
    public CreateMove(String [] info){
            moveAll(info);
            generateBugsDevsCoordinates(info);

    }

    private void moveAll(String [] info){
        try {
            int i = 1;
            for (Planets planet : planets) {
                planet.move(Integer.parseInt(info[i]));
                i += 1;
            }
        }catch (NumberFormatException e){

        }
    }
    public void generateBugsDevsCoordinates(String [] info) {
        try {
            createBD.generateCoordinates(BugsDevs.getBugs(), planets, Integer.parseInt(info[8]));
            createBD.generateCoordinates(BugsDevs.getDevs(), planets, Integer.parseInt(info[9]));
        }catch (NumberFormatException e){

        }
    }

    private static List<Planets> planetsL(){
        List<Planets> planetsList = new ArrayList<>();

        planetsList.add(new Python());
        planetsList.add(new JS());
        planetsList.add(new RubyRails());
        planetsList.add(new Php());
        planetsList.add(new CSharp());
        planetsList.add(new CPlusPlus());
        planetsList.add(new C());

        return planetsList;
    }

    public List<Planets> getPlanets() {
        return planets;
    }
}
