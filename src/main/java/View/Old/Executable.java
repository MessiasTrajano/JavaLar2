package View.Old;

import Control.Entities.Components.Planets;
import Control.Entities.Planets.*;
import Control.Entities.BugsDevs.BugsDevs;

import java.util.ArrayList;
import java.util.List;

public class Executable {
    private List<Planets> planetsList = instances();
    private Communication inter = new Communication();
    private Shows show = new Shows();
    private BugsDevs ident = new BugsDevs();


    public Executable(){
        runSimulation();
    }
    
    private void runSimulation(){

        generateBugsDevsCoordinates();
        movePlanets();
        //SystemJavaLar.showMatriz(planetsList);
        Shows.showAll(planetsList, inter.getInstants());


        show.showSummary(planetsList, inter.getInstants(), inter.getInstantAccumulator());
    }

    public void generateBugsDevsCoordinates() {
        ident.generateCoordinates(BugsDevs.getBugs(), planetsList,inter.getBugs());
        ident.generateCoordinates(BugsDevs.getDevs(), planetsList,inter.getDevs());
    }

    private void movePlanets() {
        for (Planets planet : planetsList) {
            planet.move(inter.getInstants());
        }
    }

    private List<Planets> instances(){
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
}

