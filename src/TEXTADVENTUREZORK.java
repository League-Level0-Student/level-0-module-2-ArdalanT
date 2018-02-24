import java.util.Scanner;

public class TEXTADVENTUREZORK {
public static void main(String[] args) {
	System.out.println("Hello and welcome to ZORK \n you start your  journey in the dungeon, dark walls surround you. But there are two doors, one red and one blue, which one do you go through?.");
Scanner kb = new Scanner (System.in);
	String ans = kb.nextLine();
	if( ans.equals("blue")) {
	System.out.println("OH NOOOOOOO!!!!!!!!!!!!!!! \n YOU FELL INTO A HOLE AND ARE TRAPPED");
	}
	
	else if(ans.equals("red")) {
		System.out.println("you are in another room, where you see a set of starirs leading up into the abyss, do you choose to go up");
	ans = kb.nextLine();
	if(ans.equals("yes")) {
		System.out.println("You arrive in a huge cavern \n BUT WAIT a dragon comes flying out of nowhere and EATS YOU. You arrive in the underworld and are greeted by your worst nightmare. Do you choose to continue");
		if (ans.equals("yes")) {
			System.out.println("YOU CONTINUE INTO THE UNDERWORLD \n DUN DUN DUN! \n here you see a huge monster who you have to fight in order to defeat and gain safe passage back into the real world.");
		}
			
	}

	
	if(ans.equals("no")) {
		System.out.println("you stay in that room forever until you finally die from boredom");
	}
	}









}
}
