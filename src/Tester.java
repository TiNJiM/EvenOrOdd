import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner (System.in);
		System.out.print ("Enter an integer: ");
		int n = kbReader.nextInt();
		if (n%2 == 0)
		{
			System.out.println ("The integer " + n + " is even.");
		}
		else
		{
			System.out.println("The integer " + n +" is odd");
		}
	}
}
