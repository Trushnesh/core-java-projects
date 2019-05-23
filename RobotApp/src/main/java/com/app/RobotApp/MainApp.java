package com.app.RobotApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		OldRobotCreation ro = new OldRobotCreation();
		List<Robot> oldRobotLine = ro.createOldRobots();

		NewRobotCreation nr = new NewRobotCreation();
		List<NewRobotPartWithDonor> newRobotLine = nr.createNewRobots(oldRobotLine);

		List<NewRobotPartWithDonor> robots = new ArrayList<NewRobotPartWithDonor>();
		NewRobotPartWithDonor robotType = null;

		/*
		 * RequestType=1 if, All available models of a particular type.(eg. View all Betty the Busibot models) 
		 * RequestType=2 if, One model of a particular type (eg. Single Andy the Android) 
		 * RequestType=3 if, Total counts of available types (eg how many Andy, how many Betty…etc.) 
		 * RequestType=4 if, A model that donated a particular part (ie. output of donor model and part donated and
		 * receiving model)
		 */
		//viewAllRobotsOfAModel("Betty the Busibot", newRobotLine, robotType, robots, 4,oldRobotLine);






		 
		  Scanner in = new Scanner(System.in);
	        // Display the menu
	        System.out.println("1\t"+NewRobotCreation.ANDY);
	        System.out.println("2\t"+NewRobotCreation.BETTY);
	        System.out.println("3\t"+NewRobotCreation.BOBI);
	        System.out.println("4\t"+NewRobotCreation.FRED);

	        System.out.println("Please enter your choice:");
	        
	        //Get user's choice
	        int choice=in.nextInt();
	        inputloop:while(true) { 
	        //Display the title of the chosen module
	        switch (choice) {
	            case 1: 
	            	 System.out.println("\n** Andy the Android **");
	            	 
	            	System.out.println("1\t View All Available Models");
	     	        System.out.println("2\t View one model");
	     	        System.out.println("3\t Total count");
	     	        System.out.println("4\t Donor part and the Donor Model");

	     	        System.out.println("Please enter your choice:");
	     	       int choice1=in.nextInt();
	     	      switch (choice1) {
		            case 1:
	            	viewAllRobotsOfAModel(NewRobotCreation.ANDY, newRobotLine, robotType, robots, 1,oldRobotLine); 
	            	break;
		            case 2:
		            	viewAllRobotsOfAModel(NewRobotCreation.ANDY, newRobotLine, robotType, robots, 2,oldRobotLine); 
			   break;
		            case 3:
		            	viewAllRobotsOfAModel(NewRobotCreation.ANDY, newRobotLine, robotType, robots, 3,oldRobotLine); 
			   break;
		            case 4:
		            	viewAllRobotsOfAModel(NewRobotCreation.ANDY, newRobotLine, robotType, robots, 4,oldRobotLine); 
			   break;
		            default: System.out.println("Invalid choice");}
	            	
	            	
	            	break;
	            case 2:  
	            System.out.println("\n** Betty the Busibot **");
           	 
            	System.out.println("1\t View All Available Models");
     	        System.out.println("2\t View one model");
     	        System.out.println("3\t Total count");
     	        System.out.println("4\t Donor part and the Donor Model");

     	        System.out.println("Please enter your choice:");
     	       int choice2=in.nextInt();
     	      switch (choice2) {
	            case 1:
            	viewAllRobotsOfAModel(NewRobotCreation.BETTY, newRobotLine, robotType, robots, 1,oldRobotLine); 
            	break;
	            case 2:
	            	viewAllRobotsOfAModel(NewRobotCreation.BETTY, newRobotLine, robotType, robots, 2,oldRobotLine); 
		   break;
	            case 3:
	            	viewAllRobotsOfAModel(NewRobotCreation.BETTY, newRobotLine, robotType, robots, 3,oldRobotLine); 
		   break;
	            case 4:
	            	viewAllRobotsOfAModel(NewRobotCreation.BETTY, newRobotLine, robotType, robots, 4,oldRobotLine); 
		   break;
	            default: System.out.println("Invalid choice");}
	            
	            
	            break;
	            case 3: 
	                System.out.println("\n** Bobi the racedroid **");
	              	 
	            	System.out.println("1\t View All Available Models");
	     	        System.out.println("2\t View one model");
	     	        System.out.println("3\t Total count");
	     	        System.out.println("4\t Donor part and the Donor Model");

	     	        System.out.println("Please enter your choice:");
	     	       int choice3=in.nextInt();
	     	      switch (choice3) {
		            case 1:
	            	viewAllRobotsOfAModel(NewRobotCreation.BOBI, newRobotLine, robotType, robots, 1,oldRobotLine); 
	            	break;
		            case 2:
		            	viewAllRobotsOfAModel(NewRobotCreation.BOBI, newRobotLine, robotType, robots, 2,oldRobotLine); 
			   break;
		            case 3:
		            	viewAllRobotsOfAModel(NewRobotCreation.BOBI, newRobotLine, robotType, robots, 3,oldRobotLine); 
			   break;
		            case 4:
		            	viewAllRobotsOfAModel(NewRobotCreation.BOBI, newRobotLine, robotType, robots, 4,oldRobotLine); 
			   break;
		            default: System.out.println("Invalid choice");}
		            	            	
	                    break;
	            case 4: 
	            	 System.out.println("\n** Fred the Friendlybot **");
	              	 
		            	System.out.println("1\t View All Available Models");
		     	        System.out.println("2\t View one model");
		     	        System.out.println("3\t Total count");
		     	        System.out.println("4\t Donor part and the Donor Model");

		     	        System.out.println("Please enter your choice:");
		     	       int choice4=in.nextInt();
		     	      switch (choice4) {
			            case 1:
		            	viewAllRobotsOfAModel(NewRobotCreation.FRED, newRobotLine, robotType, robots, 1,oldRobotLine); 
		            	break;
			            case 2:
			            	viewAllRobotsOfAModel(NewRobotCreation.FRED, newRobotLine, robotType, robots, 2,oldRobotLine); 
				   break;
			            case 3:
			            	viewAllRobotsOfAModel(NewRobotCreation.FRED, newRobotLine, robotType, robots, 3,oldRobotLine); 
				   break;
			            case 4:
			            	viewAllRobotsOfAModel(NewRobotCreation.FRED, newRobotLine, robotType, robots, 4,oldRobotLine); 
				   break;
			            default: System.out.println("Invalid choice");}
			            	            	
	            	break;
	            default: System.out.println("Invalid choice");
	        }
	        }//end of switch
	    }//end of the main method
	//end of class
		  
	

	private static NewRobotPartWithDonor viewAllRobotsOfAModel(String string, List<NewRobotPartWithDonor> newRobotLine,
			NewRobotPartWithDonor robotType, List<NewRobotPartWithDonor> robots, int requestType, List<Robot> oldRobotLine) {
		for (NewRobotPartWithDonor nrpwd : newRobotLine) {
			if (nrpwd.getModel() == string) {
				robotType = nrpwd;
				if (robotType != null) {
					robots.add(robotType);
					// All available models of a particular type.(eg. View all Betty the Busibot
					// models)
					if (requestType == 1)
						System.out.println(robotType);

				}
			}
		}
		// One model of a particular type (eg. Single Andy the Android)
		if (requestType == 2)
			System.out.println(robotType);
		// Total counts of available types (eg how many Andy, how many Betty…etc.)
		if (requestType == 3)
			System.out.println("Robot Type: " + robotType.getModel() + ", Number of Robots available: " + robots.size());
		if (requestType == 4) {
			System.out.println(robotType);
			viewDonorModel(robotType,oldRobotLine);
		}
		return robotType;
	}

	private static void viewDonorModel(NewRobotPartWithDonor robotType, List<Robot> oldRobotLine) {
		
		final String armResult = stripNonDigits(robotType.getArmDonor());
		final String visionResult = stripNonDigits(robotType.getVisionDonor());
		final String brainResult = stripNonDigits(robotType.getBrainDonor());
		
		
		int armserialNumber=Integer.parseInt(armResult.substring(1));
		int visionserialNumber=Integer.parseInt(visionResult.substring(1));
		int brainserialNumber=Integer.parseInt(brainResult.substring(1));
		
		for(Robot orl:oldRobotLine) { 
			if(orl.getSerialNumber()==armserialNumber) {
				System.out.println("Arm and Mobility Donor: "+orl);
			}
			if(orl.getSerialNumber()==visionserialNumber) {
				System.out.println("Vision and Power_plant Donor: "+orl);
			}
			if(orl.getSerialNumber()==brainserialNumber) {
				System.out.println("Brain and Media_center Donor: "+orl);
			}
			}
	}

	public static String stripNonDigits(
			final CharSequence input ){
		final StringBuilder sb = new StringBuilder(
				input.length() );
		for(int i = 0; i < input.length(); i++){
			final char c = input.charAt(i);
			if(c > 47 && c < 58){
				sb.append(c);
			}
		}
		return sb.toString();
	}
}

