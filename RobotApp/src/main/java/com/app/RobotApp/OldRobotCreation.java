package com.app.RobotApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import com.app.RobotApp.RobotPart.Arms;
import com.app.RobotApp.RobotPart.Brain;
import com.app.RobotApp.RobotPart.Media_center;
import com.app.RobotApp.RobotPart.Mobility;
import com.app.RobotApp.RobotPart.Power_Plant;
import com.app.RobotApp.RobotPart.Vision;

public class OldRobotCreation {
	//Adding all 300 Robots to the Old line of Robots
	public List<Robot> createOldRobots() {

		// Create MK1
		List<Robot> mk1 = createOldRobotsList("mk1");
		// Create MK2
		List<Robot> mk2 = createOldRobotsList("mk2");
		// Create MK3
		List<Robot> mk3 = createOldRobotsList("mk3");
		// Create MK4
		List<Robot> mk4 = createOldRobotsList("mk4");
		// Create MK5
		List<Robot> mk5 = createOldRobotsList("mk5");

		List<Robot> allOldRobots = new ArrayList<Robot>();
		allOldRobots.addAll(mk1);
		allOldRobots.addAll(mk2);
		allOldRobots.addAll(mk3);
		allOldRobots.addAll(mk4);
		allOldRobots.addAll(mk5);
		System.out.println("Number of Robots in old line: "+allOldRobots.size());
	
		return allOldRobots;
	}
	// Create 60 of Each Old Robot type
	public List<Robot> createOldRobotsList(String modelName) {
		List<Robot> oldRob = new ArrayList<Robot>();
		// create old robot 
		Robot rob = createRobot();
		rob.setModel(modelName);
		/*
		 * Create 60 copies of old robot,assign random and unique serial number to
		 * each
		 */
		for (int i = 0; i <= 59; i++) {
			try {
				Robot newrob = (Robot) rob.clone();
				newrob.setSerialNumber(generateSerialNumber());
				oldRob.add(newrob);
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Sample of MK series:: "+oldRob.get(10));
		return oldRob;

	}
	//create a old robot of one type
	public Robot createRobot() {
		Robot robot = new Robot();
		robot.setArms(Arms.getRandom());
		robot.setBrain(Brain.getRandom());
		robot.setMedia_center(Media_center.getRandom());
		robot.setMobility(Mobility.getRandom());
		robot.setPower_plant(Power_Plant.getRandom());
		robot.setVision(Vision.getRandom());
		return robot;
	}

	//generate unique and random serial number
	public Integer generateSerialNumber() {
		Random r = new Random();
		int serialNumber = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 1) {
			int randnumber = r.nextInt(9999999) + 10;
			set.add(randnumber);
		}

		for (int raandnos : set) {
			serialNumber = raandnos;
		}

		return serialNumber;
	}


}
