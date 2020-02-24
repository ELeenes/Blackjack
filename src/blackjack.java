import java.util.Random;
import java.util.Scanner;

public class blackjack {
	public static void main(String[] args) {
		HetSpel spel = new HetSpel();
		spel.verkrijgKaarten();
		spel.speelRonden();
		System.out.println("Bedankt voor het spelen");
	}	
}
class HetSpel{
	Scanner sc = new Scanner(System.in);
	String[] deKaarten = new String[52];
	Random r = new Random();
	
	void verkrijgKaarten() {
		String[] suits = {"Hearts", "Spades", "Diamond","Clubs"};
		String[] values = {"2", "3", "4","5","6", "7", "8","9","10", "J", "Q","K","A"};
		
		int totaalTeller = 0;
		for( int x = 0 ; x < suits.length ; x++ ) {
			for( int y = 0 ; y < values.length ; y++ ) {
				deKaarten[totaalTeller] = suits[x] +" "+values[y];	
			//	System.out.println( deKaarten[totaalTeller] );
				totaalTeller++;
			}
		}	
	}
	void speelRonden(){
		for(int i = 0; 5<6 ; i++) {
			System.out.println("Druk k voor nieuwe kaart of q om te stoppen");
			String invoer = sc.next();
			if(invoer.equals("q")) {
				break;
			}
			if(invoer.equals("k")) {
				int uitzoekInt = r.nextInt(52);
				System.out.println("De kaart die ik krijg is: "+deKaarten[uitzoekInt]);
			}
		}
	}
	int bepaalWaarde(String deKaart) {
		char laatsteLetter = deKaart.charAt(deKaart.length()-1);
		switch(laatsteLetter) {
		case 'Q' :
			return 10;
		}
	return -1;
	}
}
