
public class BrownBear extends Animal implements Walkable, Swimmable{

	private String subSpecies;
	
	public BrownBear() {
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
		this.subSpecies = "Alaskan";
	}//end empty argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies) throws InvalidSubspeciesException {
		this.simID = simID;// data passed into the constructor
		this.location = l;//location passed into the constructor
		this.subSpecies = subSpecies;// data passed into the constructor
		this.full = false;
		this.rested = true;
	}//end preferred constructor

	public String getSubSpecies() throws InvalidSubspeciesException{
		
		InvalidSubspeciesException ISSE = new InvalidSubspeciesException("Invalid subspecies.");
		try {	
		
		switch(subSpecies){
			case "Alaskan":
				subSpecies = "Alaskan";
				break;
			case "Asiatic":
				subSpecies = "Asiatic";
				break;
			case "European":
				subSpecies = "European";
				break;
			case "Grizzly":
				subSpecies = "Grizzly";
				break;
			case "Kodiak":
				subSpecies = "Kodiak";
				break;
			case "Siberian":
				subSpecies = "Siberian";
				break;
			default:
				subSpecies="Alaskan";
				throw ISSE;
		}
		
		}catch (InvalidSubspeciesException e) {
			System.out.println(e.getMessage());
			
		}
		return subSpecies;
		
	}//end getSubSpecies
	

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;

	}//endsetSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	@Override
	public void swim(int direction) {
		// TODO Auto-generated method stub
		  switch (direction) {
          case 1:
              location.update(location.getxCoord(), location.getyCoord() + 2);
              break;
          case 2:
              location.update(location.getxCoord(), location.getyCoord() - 2);
              break;
          case 3:
              location.update(location.getxCoord() + 2, location.getyCoord());
              break;
          case 4:
              location.update(location.getxCoord() - 2, location.getyCoord());
              break;
          default:
              System.out.println("Invalid direction.");
      }
	}//end swim

	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		  switch (direction) {
          case 1:
              location.update(location.getxCoord(), location.getyCoord() + 3);
              break;
          case 2:
              location.update(location.getxCoord(), location.getyCoord() - 3);
              break;
          case 3:
              location.update(location.getxCoord() + 3, location.getyCoord());
              break;
          case 4:
              location.update(location.getxCoord() - 3, location.getyCoord());
              break;
          default:
              System.out.println("Invalid direction.");
      }
	}//end walk
	
	
}//end class
