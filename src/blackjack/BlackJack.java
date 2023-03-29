package blackjack;

import java.security.DomainCombiner;

public class BlackJack {

// 1. 카드 배열을 전달 받으면 총합을 구하는 메서드
public static int getValue(Card[] card){
	int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	int value = 0;
	int aCount = 0;
	
	for(int i = 0; i < card.length && card[i] != null; ++i) {	
		
		// System.out.println(card[i]);
		
		value += values[card[i].rank]; // card[i]를하면 문양이 나오고 .rank를 해야 숫자가 나온다
	
		// 나중에 21이 넘는 경우 A개수만큼 10을 빼기 위해 a의 개수를 센다
		if(card[i].rank == 0) {
			++aCount;
		}	
	}
	
	
	// 카드 가치 합이 21이 넘고, A를 보유하고 있다면 가치를 10 감소
		while(value > 21 && aCount > 0) {
			value -= 10;
			--aCount;
		}
		return value;
	}
   
}

	


