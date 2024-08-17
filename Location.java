import java.util.*;
public class Location {

	private int xCoord;
	private int yCoord;
	
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}//end empty- constructor
	
	public Location(int x, int y) throws InvalidCoordinateException{
		InvalidCoordinateException IXSCE = new InvalidCoordinateException("Coordinates cannot be less than zero.");
		
		this.xCoord = x;
		this.yCoord = y;
		try {
			
			
			if (xCoord < 0 || yCoord < 0) {
				this.xCoord = 0;
				this.yCoord = 0;
				throw IXSCE;
	        }
			else 
				this.xCoord = xCoord;
				this.yCoord = yCoord;
			
			} catch (InvalidCoordinateException e) {
				System.out.println(e.getMessage());
			}
	
	}//end preferred constructor
	
	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	public void setxCoord(int xCoord) throws InvalidCoordinateException{
		
		InvalidCoordinateException IXCE = new InvalidCoordinateException("x coordinate cannot be less than zero.");
		try {
			
		
			if (xCoord < 0) {
				this.xCoord = 0;
	           throw IXCE;
	        }
			else 
				this.xCoord = xCoord;
			
			} catch (InvalidCoordinateException e) {
				System.out.println(e.getMessage());
			}
	}//end setxCoord

	public int getyCoord() {
		return yCoord;
	}//endgetyCoord

	public void setyCoord(int yCoord) throws InvalidCoordinateException{
		
		InvalidCoordinateException IYCE = new InvalidCoordinateException("y coordinate cannot be less than zero.");
		try {
			
			if (yCoord < 0) {
				this.yCoord = 0;
	           throw IYCE;
	        }
			else 
				this.yCoord = yCoord;
			} catch (InvalidCoordinateException e) {
				System.out.println(e.getMessage());
			}
	}//endsetyCoord

	public void update(int x, int y) throws InvalidCoordinateException{
		this.setxCoord(x);
		this.setyCoord(y);
	}//end update
	
	 public int[] getCoordinates() {
		 return new int [] {xCoord , yCoord};
	 } //end getCoodinates


	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
	
}//end class
