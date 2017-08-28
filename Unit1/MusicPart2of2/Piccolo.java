/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Piccolo.java
 * 	Piccolo info and data
 */
package Unit1.MusicPart2of2;

public class Piccolo extends Instrument {
	
	Piccolo(String name){
		super(name);
	}

	@Override
	String makeSound() {
		return "peep";
	}
	
	public String toString(){
		return super.getMusician();
	}
	
}
