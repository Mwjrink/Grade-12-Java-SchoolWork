/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Clarinet.java
 * 	Clarinet info and data
 */
package Unit1.MusicPart2of2;

public class Clarinet extends Instrument {
	
	Clarinet(String name){
		super(name);
	}

	@Override
	String makeSound() {
		return "squawk";
	}
	
	public String toString(){
		return super.getMusician();
	}
	
}
