import java.awt.Graphics;
import java.awt.Image;

public class Jewel extends MovingThing{
	private int speed;
	private Image image;
	
	public Jewel(){
		this(400, 300, 50, 50, 1);
	}
	
	public Jewel(int x, int y){
		super(x,y);
	}
	public Jewel(int x, int y, int w, int h){
		super(x,y,w,h);
		setSpeed(0);
	}
	public Jewel(int x, int y, int w, int h, int s){
		super(x,y,w,h);
		setSpeed(s);
	}

	@Override
	public void setSpeed(int s) {
		// TODO Auto-generated method stub
		speed = s;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		if (getX()>800 || getX()<0){
			speed *= -1;
			setY(getY()+getHeight());
		}
		setX(getX()+speed);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		
	}
}
