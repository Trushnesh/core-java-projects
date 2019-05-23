package com.app.RobotApp;

public class RobotPart {
     public static final Double BRAIN_LOW=2.5;
     public static final Double BRAIN_MED=3.5;
     public static final Double BRAIN_HIGH=4.5;
     public static final String CAT_TRACKS="catapilar tracks";
     public static final String WHEELS="wheels";
     public static final String LEG="legs";
     public static final String HEAT_VISION="heat vision";
     public static final String FULL_COLOR="full colour";
    
	public static final String NIGHT_VISION="night vision";
     public static final String CLAWS="claws";
     public static final String GRPPIERS="grippers";
     public static final String FINGERS="articulated fingers";
     public static final String SONY="sony";
      public static final String JVC="jvc";
     public static final String MERIDIAN="meridian";
     public static final String LITHIUM="lithium";
     public static final String HYDROGEN="hydrogen";
     public static final String PLASMA="plasma (40 watt range)";
     
    
  public enum  Brain { BRAIN_LOW, BRAIN_MED, BRAIN_HIGH ;
	  public static Brain getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }}
  public enum Mobility { CAT_TRACKS, WHEELS, LEG ;
	  public static Mobility getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }}
  public enum Vision { HEAT_VISION, FULL_COLOR, NIGHT_VISION ;
	  public static Vision getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }}
  public enum Arms { CLAWS, GRPPIERS, FINGERS ;
	  public static Arms getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }}
  public enum Media_center { SONY, JVC, MERIDIAN ;
	  public static Media_center getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }}
  public enum Power_Plant { LITHIUM, HYDROGEN, PLASMA ;
	  public static Power_Plant getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }}
public static Double getBrainLow() {
	return BRAIN_LOW;
}
public static Double getBrainMed() {
	return BRAIN_MED;
}
public static Double getBrainHigh() {
	return BRAIN_HIGH;
}
public static String getCatTracks() {
	return CAT_TRACKS;
}
public static String getWheels() {
	return WHEELS;
}
public static String getLeg() {
	return LEG;
}
public static String getHeatVision() {
	return HEAT_VISION;
}
public static String getFullColor() {
	return FULL_COLOR;
}
public static String getNightVision() {
	return NIGHT_VISION;
}
public static String getClaws() {
	return CLAWS;
}
public static String getGrppiers() {
	return GRPPIERS;
}
public static String getFingers() {
	return FINGERS;
}
public static String getSony() {
	return SONY;
}
public static String getJvc() {
	return JVC;
}
public static String getMeridian() {
	return MERIDIAN;
}
public static String getLithium() {
	return LITHIUM;
}
public static String getHydrogen() {
	return HYDROGEN;
}
public static String getPlasma() {
	return PLASMA;
}

  
@Override
	public String toString() {
		return "RobotPart [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}


