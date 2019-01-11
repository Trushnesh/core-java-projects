package com.project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
//A class to implement serialization,Java Collection and Exception handling
public class PlayersObject implements Serializable {
	//Name of the file which gets created in the class path 
	String FILENAME = "ObjectDB";
	//Default serialization id
	private static final long serialVersionUID = 1L;

	//Save List of Players in a file
	public void savePlayer(List<Player> playerList2){

		//Exception handling using try-catch block
		try {
			//Implementation of Java serialization
			FileOutputStream fileOut = new FileOutputStream(FILENAME);
			ObjectOutputStream oos = new ObjectOutputStream(fileOut);
			//write list of players into a file
			oos.writeObject(playerList2);
			//close the connection
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
