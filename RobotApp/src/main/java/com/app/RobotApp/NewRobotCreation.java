package com.app.RobotApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewRobotCreation {
	public static final String ANDY = "Andy the Android";
	public static final String BETTY = "Betty the Busibot";
	public static final String BOBI = "Bobi the racedroid";
	public static final String FRED = "Fred the Friendlybot";

	Random rand = new Random();
	int indexSIze;

	// Adding all 400 Robots to the New line of Robots
	public List<NewRobotPartWithDonor> createNewRobots(List<Robot> oldRobots) {

		// Create 100 ANDI Robots
		List<NewRobotPartWithDonor> mk1 = createNewRobotsList(oldRobots, ANDY);
		// Create 100 BETTY Robots
		List<NewRobotPartWithDonor> mk2 = createNewRobotsList(oldRobots, BETTY);
		// Create 100 BOBI Robots
		List<NewRobotPartWithDonor> mk3 = createNewRobotsList(oldRobots, BOBI);
		// Create 100 FRED Robots
		List<NewRobotPartWithDonor> mk4 = createNewRobotsList(oldRobots, FRED);

		List<NewRobotPartWithDonor> allNewRobots = new ArrayList<NewRobotPartWithDonor>();
		allNewRobots.addAll(mk1);
		allNewRobots.addAll(mk2);
		allNewRobots.addAll(mk3);
		allNewRobots.addAll(mk4);
		System.out.println("Number of Robots in new line: " + allNewRobots.size());

		return allNewRobots;
	}

	// Create 100 of Each New Robot type
	public List<NewRobotPartWithDonor> createNewRobotsList(List<Robot> oldRobots, String modelName) {
		List<NewRobotPartWithDonor> newRobs = new ArrayList<NewRobotPartWithDonor>();
		// create new robot from given list of old robots
		NewRobotPartWithDonor rob = createRobot(oldRobots);
		rob.setModel(modelName);
		/*
		 * Create 100 copies of new robot,assign random and unique serial number to
		 * each
		 */
		for (int i = 0; i <= 99; i++) {
			try {
				NewRobotPartWithDonor newrob = (NewRobotPartWithDonor) rob.clone();
				newrob.setSerialNumber(new OldRobotCreation().generateSerialNumber());
				newRobs.add(newrob);
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Sample of New RobotLine:: "+newRobs.get(10));
		return newRobs;

	}

	// create a new robot of one type
	public NewRobotPartWithDonor createRobot(List<Robot> oldRobots) {
		//getting random samples from the old robots(mk series)
		indexSIze = oldRobots.size();
		Robot randomElement1 = oldRobots.get(rand.nextInt(indexSIze));
		Robot randomElement2 = oldRobots.get(rand.nextInt(indexSIze) + 2);
		Robot randomElement3 = oldRobots.get(rand.nextInt(indexSIze) + 3);
		//new robot instance
		NewRobotPartWithDonor donor = new NewRobotPartWithDonor();

		donor.setMediaCenterDonor(randomElement1.getMedia_center() + " (" + randomElement1.getModel()
				+ " : serialNum : " + randomElement1.getSerialNumber() + ")");
		donor.setBrainDonor(randomElement1.getBrain() + " (" + randomElement1.getModel() + " : serialNum : "
				+ randomElement1.getSerialNumber() + ")");

		addArmandMobility(donor, randomElement1, randomElement2, oldRobots);
		addVisionAndPower(donor, randomElement1, randomElement2, randomElement3, oldRobots);

		
		return donor;
	}

	private NewRobotPartWithDonor addVisionAndPower(NewRobotPartWithDonor donor, Robot randomElement1,
			Robot randomElement2, Robot randomElement3, List<Robot> oldRobots) {
		boolean check1and3 = recurse(randomElement1.getModel(), randomElement3.getModel());
		boolean check2and3 = recurse(randomElement2.getModel(), randomElement3.getModel());
		if (check1and3 == true && check2and3 == true) {
			donor.setVisionDonor(randomElement3.getVision() + " (" + randomElement3.getModel() + " : serialNum : "
					+ randomElement3.getSerialNumber() + ")");

			donor.setPowerPlantDonor(randomElement3.getPower_plant() + " (" + randomElement3.getModel()
					+ " : serialNum : " + randomElement3.getSerialNumber() + ")");
		} else {
			randomElement3 = oldRobots.get(rand.nextInt(indexSIze) + 5);
			// System.out.println("In 2nd else:: "+randomElement3.getModel());
			addVisionAndPower(donor, randomElement1, randomElement2, randomElement3, oldRobots);
		}

		return donor;

	}

	private NewRobotPartWithDonor addArmandMobility(NewRobotPartWithDonor donor, Robot randomElement1,
			Robot randomElement2, List<Robot> oldRobots) {
		boolean cheack1and2 = recurse(randomElement1.getModel(), randomElement2.getModel());
		if (cheack1and2 == true) {

			donor.setArmDonor(randomElement2.getArms() + " (" + randomElement2.getModel() + " : serialNum : "
					+ randomElement2.getSerialNumber() + ")");
			donor.setMobilityDonor(randomElement2.getMobility() + " (" + randomElement2.getModel() + " : serialNum : "
					+ randomElement2.getSerialNumber() + ")");
		} else {
			randomElement2 = oldRobots.get(rand.nextInt(indexSIze) + 4);
			// System.out.println("In 1st else:: "+randomElement2.getModel());
			addArmandMobility(donor, randomElement1, randomElement2, oldRobots);
		}

		return donor;
	}

	//to check non-repetition of MK series samples
	public boolean recurse(String model1, String model2) {
		if (model1 != model2) {
			return true;
		} else {
			return false;
		}

	}

}
