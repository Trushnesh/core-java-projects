package com.project;


import java.io.Serializable;

//Football Player POJO class--contains instance variables(name,club,country,goalsScored,position)
//Implements Serialization of Objects
public class Player implements Serializable{
	//Default serialization id
	private static final long serialVersionUID = 1L;
	//Name of Player
	private String name;
	//Club of Player
	private String club;
	//Country of the Player
	private String country;
	//Number of Goals scored by the Player
	private int goalsScored;
	//Position of the Player
	private String position;

	//Default constructor
	public Player(){
		this.name="";
		this.club="";
		this.country="";
		this.goalsScored=0;
		this.position="";
	}


	//Parameterized constructor
	public Player(String name, String club, String country, int goalsScored,String position) {
		super();
		this.name = name;
		this.club=club;
		this.country = country;
		this.goalsScored = goalsScored;
		this.position=position;
	}


	//Getters and setters for all instance variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}

}
