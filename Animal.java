
import java.util.*;

public abstract class Animal {

	protected int simID;
	
	protected Location location;
	
	protected boolean full;
	
	protected boolean rested;
	
	public Animal() {
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	}//end empty-argument constructor
	
	public Animal(int simID, Location l) {
		this.simID = simID; 
		this.location = l;
		this.full = false;
		this.rested = true;
	}//end preferred constructor
	
	public int getSimID() throws InvalidSimIDException{
		InvalidSimIDException ISE = new InvalidSimIDException("Sim ID cannot be zero.");
		try {
			if(simID <= 0) {
				simID = 1;
				throw ISE;
			}
			else this.simID =simID;
			
		}catch (InvalidSimIDException e) {
					System.out.println(e.getMessage());
		}
		return simID;
	}//end getSimID

	public void setSimID(int simID){
		this.simID=simID;
	}//end setSimId

	public Location getLocation() {
		
		return location;
	}//end getLocation

	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFul

	public boolean isRested() {
		if (rested = true) {
			return true;
		}
		else
		return false;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested

	public boolean eat() {
		Random randEat =new Random();
		double  full= randEat.nextDouble();
		if (full <= 0.5) {
			return false;
		}
		else 
			return true;
	}//end eat
	
	public boolean sleep() {
		Random randSleep = new Random();
		
		double  rested= randSleep.nextDouble();
		if (rested <= 0.5) {
			return false;
		}
		else 
			return true;
	}//end sleep
	
}//end class
