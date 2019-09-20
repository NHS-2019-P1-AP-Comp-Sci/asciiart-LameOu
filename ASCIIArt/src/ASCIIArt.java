/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	
	public static void fire() {
		System.out.println("                                      ");
		System.out.println("           /\\            ^            ");
		System.out.println("          /  \\   ^      / |           ");
		System.out.println("         (    \\ / |_   /  \\           ");
		System.out.println("          \\  ^ v    \\ |  ^ )_         ");
		System.out.println("         _/  |\\  _/| |/ /|   \\^       ");
		System.out.println("        (    \\ \\/  \\  v | \\   \\_      ");
		System.out.println("        /   _/      )   /  )   |      ");
		System.out.println("      ^|   (         |_/   |   /      ");
		System.out.println("      (   |                /  /       ");
		System.out.println("       \\  \\_              |^  )       ");
		System.out.println("        |  /              v  |        ");
		System.out.println("        \\_^|               \\_/        ");
		
	}
	
	public static void quote() {
		System.out.println("\n\"The night is dark and full of terrors.\"");
	}
	
	public static void speaker() {
		System.out.println("                          --- Melisandre");
	}
	
	public static void caption() {
		System.out.print("\n             A burning fire             \n");
	}
	
	public static void main (String [] args) {
		fire();
		quote();
		speaker();
		caption();
	}
}