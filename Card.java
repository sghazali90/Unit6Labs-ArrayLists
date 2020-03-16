/**
 * Class Card
 */
public class Card {
	
	//Fields
	String suit; 
	int rank;

	//Constructor 
	public Card(String suit, int rank ){
		this.suit= suit; 
		this.rank= rank;
	}
	
	//method that converts the rank as a string
	public String rankAsString(){
		String[] faces = {"Jack", "Queen","King", "Ace"};
		
		if (rank>10){
			//convert rank 11-14 to numbers 0-3
			return faces[rank%10-1];
		}else{
			return ""+ rank;
		}
	}

	//toString Method
	public String toString(){
		return (rankAsString() + " of " + this.suit);
	}
	
	//method that returns a list of all the suits
	public static String[] suits(){
		String[] s={"Clubs", "Diamonds","Hearts","Spades"};
		return s; 
	}
	
	
	}
