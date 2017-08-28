/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Instrument.java
 * 	Instrument info and data
 */
package Unit1.MusicPart1of2;

public abstract class Instrument {
	
	String name;
	
	Instrument(String name) {
		this.name = name;
	}
	
	String getMusician() {
		return name;
	}
 
	abstract String makeSound();
	
}
