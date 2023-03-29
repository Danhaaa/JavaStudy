package yacht;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
	
	private final static boolean DEBUG = true;
	
	ArrayList<Integer> hand = new ArrayList<>(5);
	
	public Dice() {
		Collections.addAll(hand, 6,6,6,6,6);
		roll();
	}
	
	// 5개 다 던지기
	public void roll() {
		int size = hand.size();
		for(int i = 0; i < size; ++i) {
			roll(i);
		}
	}
	
/*
	public void roll() {
		hand.set(0, (int)(Math.random() * 6 + 1));
		hand.set(1, (int)(Math.random() * 6 + 1));
		hand.set(2, (int)(Math.random() * 6 + 1));
		hand.set(3, (int)(Math.random() * 6 + 1));
		hand.set(4, (int)(Math.random() * 6 + 1));
	}
*/
	// 하나 정해서 던지기
	public void roll(int index) {
		System.out.printf("hand[%d]번째 주사위 다시 던짐!\n", index);
		hand.set(index, (int)(Math.random() * 6 + 1));
	}

	
	// "13" -> 1번, 3번 다시 던지기, "123" -> 1,2,3번 다시 던지기
	public void roll(String indexs) {
		for(int i = 0; i < indexs.length(); ++i) {
			roll(indexs.charAt(i) - '0' -1);
		}
	}	

	@Override
	public String toString() {
		return hand.toString();
	}
	
}
