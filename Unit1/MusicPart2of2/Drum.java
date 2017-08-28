/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Drum.java
 * 	Drum info and data
 */
package Unit1.MusicPart2of2;

public class Drum extends Percussion {
	
	Drum(String name){
		super(name);
	}

	@Override
	String makeSound() {
		return "boom";
	}
	
	public String toString(){
		return super.getMusician();
	}

}
