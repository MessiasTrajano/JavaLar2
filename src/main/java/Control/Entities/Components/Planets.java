package Control.Entities.Components;


import Control.Entities.BugsDevs.BugsDevs;
import Control.Calculations.Calculation;
import Control.Entities.BugsDevs.Verifications;

import javax.swing.*;


public abstract class Planets {

	protected String name;
	protected boolean isAlive = true;
	protected int dislocation;
	protected int distanceTraveled;
	protected double rotation;
	protected String history;
	protected double years = 0;
	protected int hitDevs;
	protected int hitBugs;
	protected Location location;
	protected ImageIcon imageIcon;

	private void setAlive() {
		if (dislocation <= 0) {
			this.isAlive = false;
		}
	}

	//Method for defining what will happen at a specific time
	public void move(int instant){
		//Variable to store how far the planet has moved in a period
		int distanceInYear = 0;
		for (int i = 0; i < instant; i++) {
			if (isAlive) {
				checkCoordinatesBugsDevs();
				distanceTraveled += dislocation;
				distanceInYear += dislocation;
				moveLocation();
			}else{
				System.out.println("the" + name + "has death");
			}
		}
		years += Calculation.calculateYear(distanceInYear, Calculation.calculateOrbit(location.getMaxCoord().getX()));
	}

	//Method for checking if the planet was hit by a bug or a dev
	private void checkCoordinatesBugsDevs() {
		int x = location.getCoord().getX();
		int y = location.getCoord().getY();

		if (Verifications.checkCoordinates(BugsDevs.getBugs(), x, y)) {
			handleBugHit();
		}
		if (Verifications.checkCoordinates(BugsDevs.getDevs(), x, y)) {
			handleDevHit();
		}
	}

	private void handleBugHit() {
		dislocation--;
		hitBugs++;
		System.out.println("The planet " + name + " was hit by a bug!");
		setAlive();
	}

	private void handleDevHit() {
		dislocation++;
		hitDevs++;
		System.out.println("The planet " + name + " was hit by a dev!");
	}

	//Method for moving the planet
	private void moveLocation(){
		for (int i = 0; i < dislocation; i++) {

			if (location.getCoord().getY() == location.getMinCoord().getY() && location.getCoord().getX() > location.getMaxCoord().getX()) {
				location.getCoord().setX(location.getCoord().getX() - 1);

			} else if (location.getCoord().getX() == location.getMinCoord().getX() && location.getCoord().getY() < location.getMaxCoord().getY()) {
				location.getCoord().setY(location.getCoord().getY() + 1);

			} else if (location.getCoord().getY() == location.getMaxCoord().getY() && location.getCoord().getX() < location.getMaxCoord().getX()) {
				location.getCoord().setX(location.getCoord().getX() + 1);

			} else if (location.getCoord().getX() == location.getMaxCoord().getX() && location.getCoord().getY() > location.getMinCoord().getY()) {
				location.getCoord().setY(location.getCoord().getY() - 1);

			} else if (location.getCoord().getY() == location.getMinCoord().getY() && location.getCoord().getX() > location.getMinCoord().getX()) {
				location.getCoord().setX(location.getCoord().getX() - 1);

			}
		}
	}

	//Methods Getters and Setters
	public Location getLocation() {
		return location;
	}

	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	public String getName() {
		return name;
	}

	public int getDislocation() {
		return dislocation;
	}

	public double getRotation() {
		return rotation;
	}

	public String getHistory() {
		return history;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public int getHitDevs() {
		return hitDevs;
	}

	public int getHitBugs() {
		return hitBugs;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public double getYears() {
		return years;
	}
}
