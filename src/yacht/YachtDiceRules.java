package yacht;

import java.util.ArrayList;
import java.util.Collections;

public class YachtDiceRules {
/*
   private static String[] names = {"Yacht", "풀하우스", "4dice"};
   private static int[] scores = {50, 35, 30,  };
   
   public static int check() {
      
      
      return 0;
   }*/
   
   // 역의 이름과 점수를 함께 리턴하기 위해 클래스를 사용할 수 있다 (DTO)
   public static YachtDiceInfo check(Dice dice) {
      ArrayList<Integer> hand = dice.hand;
      
      for (int i = 1; i <= 6; ++i) {
         int i_count = Collections.frequency(hand, i);
         
         if (Collections.frequency(hand, i) ==5) {
            return YachtDiceInfo.YACHT;
         } else if (i_count == 4) {
            return YachtDiceInfo.FOUR_OF_A_KIND;
         } else if (i_count == 2 || i_count == 3) {
            for (int j =1; j != i && j <=  6; ++j) {
               if(Collections.frequency(hand, j) == (5 - i_count)) {
                  return YachtDiceInfo.FULL_HOUSE;
               }
            }
         } else if (i == 1 || i == 2) {
            if(hand.contains(i) && hand.contains(i + 1)
                  && hand.contains(i + 2) && hand.contains(i + 3)
                  && hand.contains(i + 4)) {
               return YachtDiceInfo.LARGE_STRAIGHT;
            }
         } else if ( i ==1 || i == 2 || i ==3) {
            if(hand.contains(i) && hand.contains(i + 1)
                  && hand.contains(i + 2) && hand.contains(i + 3)) {
               return YachtDiceInfo.SMALL_STRAIGHT;
            }
         }
      }
      
      return new YachtDiceInfo("아무것도 아님", 0);
   }
   
   
}