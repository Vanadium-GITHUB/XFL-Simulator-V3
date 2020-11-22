// Main Madden Class

import java.util.*;
import java.io.*;

public class Madden {
	///// PROGRAM SETTINGS /////
	public static boolean GAME_RANDOMIZE;
	public static Random GAME_SEED;

	public static boolean GAME_DELAY;

	public static PrintStream output;

	public static void main(String[] args) {
		Scanner settings = new Scanner(System.in);
		System.out.println(" Welcome to Vanadium's XFL Simulator!");
		System.out.println(" Would you like to change simulator settings?  y/n");
		String answer = settings.nextLine();
		while (answer != "y") {
			System.out.println(" We didn't understand your answer:" + answer);
			System.out.println(" Would you like to change simulator settings?  y/n");
			answer = settings.nextLine();
		}
		if (answer == "y") {
			System.out.println("Yes");
		}
		else if (answer == "n") {
			System.out.println("No");
		}
		else {
			System.out.println("Booo!");
		}
	}
}

			
		
		