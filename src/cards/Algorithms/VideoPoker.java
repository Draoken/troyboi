package cards.Algorithms;

import java.util.Random;

public class VideoPoker {
	public static void main(String[]args){
		
		final int DECK_SIZE = 52,
				  HAND_SIZE = 5;
		int[] deck = new int[DECK_SIZE];
		int[] hand = new int[HAND_SIZE];
		
		for(int i = 0; i < DECK_SIZE; i++){		//tracks card in deck to be set
			
			Random generator = new Random();
			int random = generator.nextInt(53);
			
			for(int j = 0; j < i; j++){		//goes through deck from beginning
				if(deck[j] == random){//comparison of array element and random
					random = generator.nextInt(53);
					j = 0; //``````````````````````````````````````~~~~~~~~~~~~~~~~~~~<TODO>
				}//end if
				//~~~~~~~~~~~else
			}//end duplicate verification loop
			
			deck[i] = random;
		}//end 'set card' loop
		
		//System.out.println("  Card 1     Card 2     Card 3     Card 4     Card 5");
		
		for(int i = 0; i < HAND_SIZE; i++){
			System.out.print("Card ");
			System.out.print(i + 1);
			System.out.print(": ");
			
			hand[i] = deck[i];
			int cardVal = hand[i] % 13;
			
			if(cardVal == 13)
				System.out.print("King");
			else if(cardVal == 12)
				System.out.print("Queen");
			else if(cardVal == 11)
				System.out.print("Jack");
			else if(cardVal == 0)
				System.out.print("Ace");
			else
				System.out.print(cardVal);
			
			if(hand[i] >= 0 && hand[i] <= 12)
				System.out.println(" Clubs");
			else if(hand[i] >= 13 && hand[i] <= 25)
				System.out.println(" Spades");
			else if(hand[i] >= 26 && hand[i] <= 38)
				System.out.println(" Hearts");
			else
				System.out.println(" Diamonds");
		}//end test loop
	}

}
