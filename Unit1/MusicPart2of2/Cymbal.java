/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Cymbal.java
 * 	Cymbal info and data
 */
package Unit1.MusicPart2of2;

public class Cymbal extends Percussion{
	
	Cymbal(String name){
		super(name);
	}

	@Override
	String makeSound() {
		return "crash";
	}
	
	public String toString(){
		return super.getMusician();
	}

}
