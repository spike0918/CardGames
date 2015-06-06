import java.io.*;
import java.util.*;

public class ConstructorTester {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int value;
		int suit;
		
		System.out.println("Enter the value of the card to be created");
		value = keyboard.nextInt();
		System.out.println("Enter the suit of the card to be created (Clubs Spades Diamonds Hearts)");
		suit = keyboard.nextInt();
		Card C1 = new Card(value,suit);
		System.out.print(C1);
		
	
	}
}
