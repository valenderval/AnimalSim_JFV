
public class Goldfinch extends Animal implements Flyable,Walkable {

	private double wingSpan;
	
	public Goldfinch() {
		this.simID = 0;
		this.location = new Location (0,0);
		this.full = false;
		this.rested = true;
		this.wingSpan = 9.0;
	}//end empty-argument constructor
	
	public Goldfinch(int simID, Location l, double ws) throws InvalidWingspanException {
		this.simID = simID;//data passed into the constructor
		this.location = l;//passed into the constructor
		this.wingSpan  = ws;// data passed into the constructor
		this.full = false;
		this.rested = true;
	}// end preferred constructor

	public double getWingSpan() {
		InvalidWingspanException IWSE5 = new InvalidWingspanException("Wingspan cannot be below 5.");
		InvalidWingspanException IWSE11 = new InvalidWingspanException("Wingspan cannot be above 11.");
		try {
			if(wingSpan < 5.0 ) {
				this.wingSpan = 5.0;
				throw IWSE5;
			}
			if(wingSpan > 11.0) {
				this.wingSpan = 11.0;
				throw IWSE11;
			}
			else  this.wingSpan = wingSpan;
			
		}catch (InvalidWingspanException e) {
					System.out.println(e.getMessage());
		}

		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		
		this.wingSpan = wingSpan;
	}//end setWingSpan
	
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	public void walk(int direction) {
	
		  switch (direction) {
        case 1:
            location.update(location.getxCoord(), location.getyCoord() + 1);
            break;
        case 2:
            location.update(location.getxCoord(), location.getyCoord() - 1);
            break;
        case 3:
            location.update(location.getxCoord() + 1, location.getyCoord());
            break;
        case 4:
            location.update(location.getxCoord() - 1, location.getyCoord());
            break;
        default:
            System.out.println("Invalid direction.");
		  }
	}//end walk
	
	@Override
	public void fly(Location l) {
		this.location = l;
	}//end Fly

}//end class
