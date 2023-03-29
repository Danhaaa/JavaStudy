package myobj3;

import myobj3.Shark;

// abstract - 나중에 자식이 구현할 예정임 (인스턴스화 할 수 없음)
abstract public class Animal {

	String name;
	
	public String getName() {
		return name;
	}
	
	// 나중에 자식이 구현할 예정인 메서드
	public abstract void bite();
	
	public static void main(String[] args) {
		Animal a1 = new Shark();
		Animal a2 = new Lion();
		
		a1.bite();
		a2.bite();
	}
	
} 