package blackjack;

public class Deck {
	
	Card[] cards;
	
	int cursor = 0;
	
	public Deck() {
		this(1); // this() : 내 클래스의 다른 생성자
	}
	
	// 카드를 여러 벌 사용하고 싶은 경우
	public Deck(int size) {
		int rlen = Card.ranks.length;
		int slen = Card.shapes.length;
		
		cards = new Card[rlen * slen];
	
		for(int i = 0; i < size; ++i) {
			int index = i * slen * rlen; 
			for(int shape = 0; shape < slen; ++shape) {
				for(int rank = 0; rank < rlen; ++rank) {
					cards[index + shape * rlen + rank] = new Card(shape, rank);
			}
		}
	
	}
		shuffle();
	}
	
	public void shuffle() { // 카드 섞기
		for(int i = 0; i < cards.length * 2; ++i) {
			int ran = (int)(Math.random() * cards.length);
			Card tmp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = tmp;
		}
	}
	public Card draw() { //여러 덱을 섞은걸 맨 위부터 순서대로 카드 뽑기
		if(cursor == cards.length) {
			cursor = 0; // 덱을 처음부터 다시 카드를 섞는다
			shuffle();
		}
		return cards[cursor++];  // 뽑은 카드 횟수
	}
	
}
	
