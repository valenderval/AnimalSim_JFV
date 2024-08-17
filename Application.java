import java.util.*;
public class Application {

	public static void main(String[] args) {
		// CS131 Final Programming Project
		
		System.out.println("*********************************************");

	    System.out.println("Location Tests");
	    
	    System.out.println("*********************************************");

	    
	    Location testEmptyLoc = new Location();
		Location testLoc = new Location(10,5);

		System.out.println("x coordinate: " +testLoc.getxCoord());
		
		System.out.println("y coordinate: " +testLoc.getyCoord());
		
		testEmptyLoc.setxCoord(13);
		testEmptyLoc.setyCoord(8);
		
		System.out.println("x coordinate: "+testEmptyLoc.getxCoord());
						
		System.out.println("y coordinate: "+testEmptyLoc.getyCoord());
		
		testEmptyLoc.update(7, 7);
		
		System.out.println(testEmptyLoc.getCoordinates());
		
		System.out.println(testEmptyLoc.toString());
	    System.out.println(testLoc.toString());
	    
	    //testing InvalidCoordinatesException
		Location errorTest = new Location(-1,2);
		System.out.println(errorTest.toString());
		System.out.println();
	    
		System.out.println("*********************************************");
			
		System.out.println("Animal Tests");

		System.out.println("*********************************************");

		// error message cannot instantiate
	//	Animal animal = new Animal(); 
		System.out.println();
		System.out.println("Abstract Class");
		System.out.println();
		System.out.println("*********************************************");

		System.out.println("Goldfinch Tests");

		System.out.println("*********************************************");
		
		Goldfinch testBird = new Goldfinch();
		Goldfinch birdie = new Goldfinch(0, new Location(20,5), 3.5); 
	
		System.out.println(testBird.toString());
		System.out.println(birdie.toString());
		
		
		System.out.println("birdie SimID: "+birdie.getSimID());//this object will throw Invalid SimID
		System.out.println("birdie Location: "+birdie.getLocation());
		System.out.println("Birdie wing span: "+birdie.getWingSpan());// this object will throw InvalidWingSpanException
		
		testBird.setSimID(10);
		testBird.setLocation(new Location(20,10));
		//wing span was pre-set to 9 but I am changing it here
		testBird.setWingSpan(10.0);
		testBird.eat();
		testBird.sleep();
		
		System.out.println(testBird.toString());
		
		System.out.println(birdie.toString());
		birdie.walk(1);
		System.out.println(birdie.toString());
		birdie.fly(new Location(30,12));
		System.out.println(birdie.toString());
		
		
		
		System.out.println("*********************************************");

		System.out.println("BrownBear Tests");

		System.out.println("*********************************************");


		BrownBear testBear= new BrownBear();
		BrownBear bb = new BrownBear(21, new Location (8,30), "Winnie");
	
		System.out.println(testBear.toString());
		
		System.out.println(bb.toString());
		
		System.out.println("bb SimID: "+bb.getSimID());
		System.out.println("bb Location: "+bb.getLocation());
		System.out.println("bb subspecies: "+bb.getSubSpecies());//will throw InvalidSubspecies 
		
		testBear.setSimID(20);
		testBear.setLocation(new Location(9,32));
	
		testBear.setSubSpecies("Asiatic");
		testBear.eat();
		testBear.sleep();
		
		System.out.println(testBear.toString());
		System.out.println(bb.toString());
		bb.walk(2);
		System.out.println(bb.toString());
		bb.swim(3);
		System.out.println(bb.toString());
		
		System.out.println("*********************************************");

		System.out.println("Generics Tests");

		System.out.println("*********************************************");
		
		
		ArrayList<Animal> animalsArray = new ArrayList<Animal>();
		
		
		animalsArray.add(birdie);
		animalsArray.add(testBird);
		animalsArray.add(bb);
		animalsArray.add(testBear);
		
		for (Animal animalList : animalsArray) {
			
		
		System.out.println(animalList.toString());
		
		}
		
	}//end main

}//end class
