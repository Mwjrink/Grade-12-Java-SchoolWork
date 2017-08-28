/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Woodwind.java
 * 	Woodwind info and data
 */
package Unit1.MusicPart2of2;

public class Woodwind extends Instrument {
	
	Woodwind(String name){
		super(name);
	}

	@Override
	String makeSound() {
		return "toot";
	}
	
	public String toString(){
		return super.getMusician();
	}

}
