/* Max Rink
 * ICS4U
 * February 2 2016
 * GameBooth.java
 * plays a plate breaking game
 */
package Unit3.Project9;

import javax.swing.ImageIcon;

public class GameBooth {
	
	private ImageIcon p1, p2;
	private int cost;
	
	GameBooth(int cost, ImageIcon p1, ImageIcon p2){
		this.cost = cost;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	ImageIcon start(){
		int game1 = (int) (Math.random() + 0.5);
		int game2 = (int) (Math.random() + 0.5);
		int game3 = (int) (Math.random() + 0.5);
		if(game1 == 1 && game2 == 1 && game3 == 1)
			return p1;
		return p2;
	}

	public int getCost() {
		return cost;
	}
	
}
