/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Vocal.java
 * 	Vocal info and data
 */
package Unit1.MusicPart2of2;

public class Vocal extends Instrument {
	
	Vocal(String name){
		super(name);
	}

	@Override
	String makeSound() {
		return "LaLaLa";
	}
	
	public String toString(){
		return super.getMusician();
	}

}
