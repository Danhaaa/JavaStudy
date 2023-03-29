package quiz;

import java.util.ArrayList;

public class D10_ArrayListPractice2 {
  public static void main(String[] args) {
	  
	  ArrayList<Integer> list = new ArrayList<>(); 
	  
	  for(int i = 0; i < 100; ++i){
			 list.add((int)(Math.random() * 1001 + 4000));
			 }
	  
	  // 얕은 복사 (shallow copy) - 주소를 복사해준다
	  // ArrayList<Integer> oddList = list;
	  
	  // 깊은 복사 (deep copy) - 값을 복사해 똑같은 인스턴스를 하나 더 만든다
	  // ArrayList<Integer> oddList = new ArrayList<>();
	  // oddList.addAll(list);
	  
	  ArrayList<Integer> oddList = (ArrayList<Integer>)list.clone();
	  
	  for(int i = 0; i < oddList.size(); ++i) {
		  if(oddList.get(i) % 2 == 0){
			  oddList.remove(i--);
		  }
	  }
	  System.out.println("원본 리스트: " + list);
	  System.out.println("홀수들만 남은 리스트: " + oddList);
	  
}
}
