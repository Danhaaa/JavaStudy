import java.util.Arrays;

import blackjack.Card;
import myobj.Apple;

public class C16_Null {

		static int ab;
		static boolean abc;
		
		static Apple apple;
		static Card[] cards = new Card[52];

		public static void main(String[] args) {
			
			// 기본형 타입  초기화 - 0, false
			int a = 0;
			
			System.out.println(a);
			System.out.println(ab);
			System.out.println(abc);
			
			// 참조형 타입 초기화 - null 
			String str = null; // 참조형 타입은 주소를 가리킨다, 
			// Null 은 가리키는 주소가 없다는 뜻
			
			System.out.println(str);
			System.out.println(apple);
			System.out.println(Arrays.toString(cards));
			
			cards[0] = new Card(0, 0);
			cards[1] = new Card(0, 1);
			cards[2] = new Card(0, 2);
			
			for(int i = 0; cards[i] != null && i < cards.length; ++i) {
				cards[i].hide();
				System.out.println(cards[i]);
			}
			
	}

}
