import java.util.*;

class Deck extends Pile{

	Random r;

	public Deck(){
		super(52);
		r = new Random();
		for(int i=3;i<7;i++){
			for(int j=1;j<14;j++){
				super.put(new Card(i,j));
			}
		}
	}


	public Deck(int seed){
		super(52);
		r = new Random(seed);
		for(int i=3;i<7;i++){
			for(int j=1;j<14;j++){
				super.put(new Card(i,j));
			}
		}
	}

	public void shuffle(){
		Card temp = new Card(3,1);
		for(int i=cards.length-1;i>=1;i--){
			int p = r.nextInt(52);
			temp = cards[i];
			cards[i] = cards[p];
			cards[p] = temp;
		}
	}

//	public boolean put(Card c){
//		return false;
//	}
}
