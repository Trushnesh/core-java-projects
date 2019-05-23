package com.app.RobotApp;

import com.app.RobotApp.RobotPart.Arms;
import com.app.RobotApp.RobotPart.Brain;
import com.app.RobotApp.RobotPart.Media_center;
import com.app.RobotApp.RobotPart.Mobility;
import com.app.RobotApp.RobotPart.Power_Plant;
import com.app.RobotApp.RobotPart.Vision;

public class Robot implements Cloneable{
	private String model;
	private Integer serialNumber;
	private Brain brain;
	private Vision vision;
	private Mobility mobility;
	private Arms arms;
	private Media_center media_center;
	private Power_Plant power_plant;
	public Brain getBrain() {
		return brain;
	}
	public void setBrain(Brain brain) {
		this.brain = brain;
	}
	public Vision getVision() {
		return vision;
	}
	public void setVision(Vision vision) {
		this.vision = vision;
	}
	public Mobility getMobility() {
		return mobility;
	}
	public void setMobility(Mobility mobility) {
		this.mobility = mobility;
	}
	public Arms getArms() {
		return arms;
	}
	public void setArms(Arms arms) {
		this.arms = arms;
	}
	public Media_center getMedia_center() {
		return media_center;
	}
	public void setMedia_center(Media_center media_center) {
		this.media_center = media_center;
	}
	public Power_Plant getPower_plant() {
		return power_plant;
	}
	public void setPower_plant(Power_Plant power_plant) {
		this.power_plant = power_plant;
	}

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		} 
	
	@Override
	public String toString() {
		return "Robot [model=" + model + ", serialNumber=" + serialNumber + ", brain=" + brain + ", vision=" + vision
				+ ", mobility=" + mobility + ", arms=" + arms + ", media_center=" + media_center + ", power_plant="
				+ power_plant + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setArms(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setBrain(String string) {
		// TODO Auto-generated method stub
		
	}
}
