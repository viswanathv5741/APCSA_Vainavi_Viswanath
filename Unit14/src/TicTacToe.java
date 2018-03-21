//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		int index = 0;
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				mat[i][j] = game.charAt(index);
				index ++;
			}
		}

	}

	public String getWinner()
	{
		int oCount = 0;
		int xCount = 0;
		for (int i=0; i < mat.length; i++){
			for (int j=0; j<mat[0].length; j++){
				if (mat[i][j] == 'O'){
					oCount++;
				}
				else if (mat[i][j] == 'X'){
					xCount++;
				}
			}
			if (oCount == 3){
				return "O wins horizontally";
			}
			else if (xCount == 3){
				return "X wins horizontally";
			}
		}
		oCount = 0;
		xCount = 0;
		for (int i=0; i<mat[0].length; i++){
			for (int j=0; j<mat.length; j++){
				if (mat[i][j] == 'O'){
					oCount++;
				}
				else if (mat[i][j] == 'X'){
					xCount++;
				}
			}
			if (oCount == 3){
				return "O wins vertically";
			}
			else if (xCount == 3){
				return "X wins vertically";
			}
		}
		oCount = 0;
		xCount = 0;
		for (int i=0; i<mat.length; i++){
			if (mat[i][i] == 'O'){
				oCount ++;
			}
			else if (mat[i][i] == 'X'){
				xCount ++;
			}
			if (oCount == 3){
				return "O wins diagonally";
			}
			else if (xCount == 3){
				return "X wins diagonally";
			}
		}


		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="";






		return output+"\n\n";
	}
}