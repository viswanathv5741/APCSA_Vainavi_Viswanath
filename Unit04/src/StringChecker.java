//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = " ";

	}

	public StringChecker(String s)
	{
		setString(s);

	}

   public void setString(String s)
   {
	   word=s;
   }

	public boolean findLetter(char c)
	{
		int i = word.length();
		int val = word.indexOf(c);
		if (0 <= val && val <= (i - 1)) {
			return true;
		}else {
			return false;
		}
	}

	public boolean findSubString(String s)
	{
		int i = word.length();
		int val = word.indexOf(s);
		if (0 <= val && val <= (i-1)){
			return true;
		}else {
			return false;
		}
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}