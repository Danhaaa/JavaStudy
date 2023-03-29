package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class D07_CountRandomFruits {
/*
  리스트에 String 타입 랜덤 과일 이름을 300개 추가하고 
  각 과일이 몇 번 등장했는지 세어보세요
  (apple, banana, kiwi, orange, grape, peach, pineapple) 
 */
	
	public static void main(String[] args) {

		String[] fruitsNames = {"apple", "banana", "kiwi", 
				"orange", "grape", "peach", "pineapple"};
		
		List<String> fruits = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 0; i < 300; i++) {
			
			fruits.add(fruitsNames[r.nextInt(fruitsNames.length)]);
			
		}
		
		HashMap<String, Integer> fruitCount = new HashMap<>();
		
		for(String fruit : fruits) {
			// 새로운 과일이 등장할때는 1을 넣고 null을 리턴한다
			// 이미 값이 들어가있을때는 값을 꺼낸다
			Integer count = fruitCount.putIfAbsent(fruit, 1);
			
			// 이미 count를 세고 시작했던 과일이라면 1증가 시킨다
			if(count != null) {
				fruitCount.put(fruit, count+1);
			}
		}
		System.out.println(fruitCount);
		
		

//		int size = fruits.size();
//		int[] count = new int[fruitsNames.length];
//		
//		for(int i = 0; i < size; ++i) {
//			String fruit = fruits.get(i);
//			if(fruit.equals("apple")) {
//				count[0] += 1;
//			}else if(fruit.equals("banana")) {
//				count[1] += 1;
//			}
//			System.out.println(Arrays.toString(count));
			
			
		
//		for(int = 0; i < fruitsNames; ++i) {
//			System.out.printf("%s's count: %d\n", fruitsNames[i],
//							,Collections.frequency(fruits, fruitsNames[i]));
			
		}
	}
	
	

