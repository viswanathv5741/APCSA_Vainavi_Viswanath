//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		int index = 0;
		for (int i=0; i< maze.length; i++){
			for (int j=0; j< maze[0].length; j++){
				maze[i][j] = line.Integer.parseInt(line.charAt(index));
				index ++;
			}
		}

	}

	public boolean hasExitPath(int r, int c)
	{

		return false;
	}

	public String toString()
	{
		String output="";





		return output;
	}
}