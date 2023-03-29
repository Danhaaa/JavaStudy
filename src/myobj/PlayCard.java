package myobj;

public class PlayCard {
	

	// 각 인스턴스가 자기만의 공간을 가지고 사용한다(인스턴스 영역)
	public char suit;
	public int num;
	
	// 같은 클래스로 만들어진 모든 인스턴스가 함께 사용하는 공간
	// -> (static 영역)
		public static int width = 100; // 너비 
		public static int height = 200;	// 높이	
	
	public PlayCard(char suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	// static 메서드에서는 인스턴스 영역의 자원을 사용할 수 없다
	// -> static 메서드는 static 자원만 활용할 수 있는 메서드를 의미
	// -> this는 어디 소속인지 알려줌. static은 인스턴스가 없음
	// this는 현재 인스턴스를 뜻하기 때문에 사용할 수 없다
	public static void changeCardSize(int width, int height) {
		PlayCard.width = width;
		PlayCard.height = height;
	}
	
	// h1.info(), c10.info()
	public void info() {
		System.out.printf("[%c%d]:", suit, num);
	}
	
}

