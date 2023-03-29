package myobj;

public class House {

	public int floor;
	public String color;
	public int capacity;
	public int currGuest;

	public House(int floor, String color) {
		this.floor = floor;
		this.color = color;
	}
	
	
	public void changeColor(String col) {
		color = col;
	}
	public void enter() {
		if (capacity == currGuest) {
			System.out.println("더 이상 입장하실수 없습니다.");
			return;
		}
		currGuest += 1;
	}

}
