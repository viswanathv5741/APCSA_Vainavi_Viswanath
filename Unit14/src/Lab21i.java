//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		int size = file.nextInt();
		ArrayList<String> mazes = new ArrayList<String>();
		while (file.hasNextLine()){
			mazes.add(file.nextLine());
		}
		for (int i=0; i < mazes.size(); i++){
			Maze test = new Maze(size,mazes.get(i));
		}
	
		
	}
}