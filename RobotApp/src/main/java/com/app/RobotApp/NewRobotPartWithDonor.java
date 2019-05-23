package com.app.RobotApp;

public class NewRobotPartWithDonor implements Cloneable {
	private String model;
	private Integer serialNumber;
	private String armDonor;
	private String brainDonor;
	private String visionDonor;
	private String mobilityDonor;
	private String mediaCenterDonor;
	private String powerPlantDonor;

	
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

	
	public String getArmDonor() {
		return armDonor;
	}

	public void setArmDonor(String armDonor) {
		this.armDonor = armDonor;
	}

	public String getBrainDonor() {
		return brainDonor;
	}

	public void setBrainDonor(String brainDonor) {
		this.brainDonor = brainDonor;
	}

	public String getVisionDonor() {
		return visionDonor;
	}

	public void setVisionDonor(String visionDonor) {
		this.visionDonor = visionDonor;
	}

	public String getMobilityDonor() {
		return mobilityDonor;
	}

	public void setMobilityDonor(String mobilityDonor) {
		this.mobilityDonor = mobilityDonor;
	}

	public String getMediaCenterDonor() {
		return mediaCenterDonor;
	}

	public void setMediaCenterDonor(String mediaCenterDonor) {
		this.mediaCenterDonor = mediaCenterDonor;
	}

	public String getPowerPlantDonor() {
		return powerPlantDonor;
	}

	public void setPowerPlantDonor(String powerPlantDonor) {
		this.powerPlantDonor = powerPlantDonor;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}
	
	@Override
	public String toString() {
		return "NewRobotPartWithDonor [model=" + model + ", serialNumber=" + serialNumber + ", armDonor=" + armDonor
				+ ", brainDonor=" + brainDonor + ", visionDonor=" + visionDonor + ", mobilityDonor=" + mobilityDonor
				+ ", mediaCenterDonor=" + mediaCenterDonor + ", powerPlantDonor=" + powerPlantDonor + "]";
	}

}
