package quiz;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

public class D10_ArrayListPractice {
/*
  1. ArrayList에 4000 ~ 5000의 랜덤 정수를 100개 추가
  
  2. 모든 숫자의 평균을 구한다
  
  3. 원본에서 짝수를 모두 제거한 후 총합을 구한다
  
  4. 원본에서 홀수를 모두 제거한 후 총합을 구한다
  
  5. 10번째 홀수를 구한다 
  
  * 제네릭에는 기본형 타입을 사용할 수 없다.
   
 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); 
		
		  
	      Random ran = new Random();
	      
	      ArrayList<Integer> evens = new ArrayList<>();
	      ArrayList<Integer> odds = new ArrayList<>();
	      
	      int sum = 0;
	      int sum1 = 0;
	      
	      //1,2
	      for (int i = 0; i < 100; i++) {
	         int random = (int)(Math.random() * 1001 + 4000);

	         list.add(random);

	         sum += list.get(i);

	      }
	      System.out.println(list);
	      System.out.println("총합은 : " + sum + " 평균은 : " + ((double)sum / 100));
	   
	      for (int i = 0; i < list.size(); ++i) {
	         int num = list.get(i);
	         
	         if(num % 2 == 0) {
	            evens.add(list.get(i));
	         }else{
	            odds.add(list.get(i));
	         }
	      }
	      System.out.println(list);
	      
	      int evenSum = 0;
	      for(int i = 0; i < evens.size(); ++i) {
	         evenSum += evens.get(i);
	      }
	      
	      int oddSum = 0;
	      for (int i = 0; i < odds.size(); ++i) {
	         oddSum += odds.get(i);
	      }
	      System.out.println("총합 : " +  sum);
	      System.out.println("짝수합 : " + evenSum);
	      System.out.println("홀수합 : " + oddSum);
	      System.out.println("10번째 홀수 : " + odds.get(9));
	   }
	   
	}