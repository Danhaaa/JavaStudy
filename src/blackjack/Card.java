package blackjack;

public class Card {
	
	static char[] shapes = {'♠', '♥', '♣', '◆'};
	static String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
		
	boolean hidden;
	
	int shape;
	int rank;
	
	public Card(int shape, int rank) {
		this.shape = shape;
		this.rank = rank;
	}
	
	public void hide() {
		hidden = true;
	}
	
	public void open() {
		hidden = false;
	}
	
	
	@Override
	public String toString() {
		return String.format("%c%s", shapes[shape], ranks[rank]);
		
//		if(hidden) {
//			return "┌─────┐\n|  XX |\n└─────┘";
//		}else {
//		
//		return String.format(
//				"┌─────┐\n"
//			+   "│ %c%-2s │\n"
//			+   "└─────┘" , shapes[shape], ranks[rank]);
//	
//		}
//	
		
	}
}
