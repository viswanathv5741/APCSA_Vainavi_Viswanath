//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for (int i=0; i<size; i++){
			Alien alien = new Alien(i*50, 50, 40, 40, 1);
			add(alien);
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll(Graphics window)
	{
		for (int i=0; i<aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i=0; i<aliens.size(); i++){
			aliens.get(i).move("RIGHT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i=0; i<shots.size(); i++){
			for (int j=0; j<aliens.size(); j++){
				if ((shots.get(i).getX() >= (aliens.get(j).getX()-aliens.get(j).getWidth()/2) &&
						shots.get(i).getX() <= (aliens.get(j).getX()+aliens.get(j).getWidth()/2))
						&& (shots.get(i).getY() >= (aliens.get(j).getY()-aliens.get(j).getHeight()/2) &&
						shots.get(i).getY() <= (aliens.get(j).getY()+aliens.get(j).getHeight()/2))){
					aliens.remove(j);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
