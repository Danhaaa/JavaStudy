package yacht;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dice dice = new Dice();
		int rerollChance = 2;

		while(rerollChance > 0) {
		System.out.println(dice);
		System.out.printf("다시 (%d회 남음) > ", rerollChance);
		
		
		String input = sc.nextLine();
		
		if(input.equals("0")) {
			break;
			// 체크 시작
		}else {
			dice.roll(input);
			--rerollChance;
		}
		System.out.println(dice);
		System.out.println(YachtDiceRules.check(dice));
		
		}
	}
	
	
}
