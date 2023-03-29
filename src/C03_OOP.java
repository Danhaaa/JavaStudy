import myobj.Book;
import myobj.House;

public class C03_OOP {
/*
  # 객체 지향 프로그래밍 (Object Oriented Programming) 
  
  - 변수와 함수들을 세상에 존재하는 개념(객체)으로 묶어서 사용하는 프로그래밍 방법론
  - 변수와 함수들을 무분별하게 사용하는 것보다 현실에 존재하는 객체 단위로 
    묶어서 표현하는 것이 개발자들의 업무 효율을 높인다
  - 변수는 현실에 존재하는 객체의 상태를 나타낸다
    ex) color, name, age, ...  
  - 해당 객체의 상태를 변화시킬 수 있는 객체 내부의 함수들을 메서드라고 부른다
  
  ex) 책 (Book) -> 각각의 책이 instance, 아래 설명을 가진 것들이 클래스
  	  - 책의 상태(변수) : 전체 페이지, 현재 페이지, 눌림정도, 각 페이지의 낙서여부,
  	  					각 페이지의 메모 내용, 가치, 원래 가격, 감가상각
  	  - 책의 기능(메서드) : 페이지를 넘기는 기능 (몇 페이지 넘길지),
  	   					해당 페이지에 메모하는 기능, 형광펜을 칠하는 기능, ...
  	# 클래스 (Class)
  	
  	- 객체지향 프로그래밍의 객체를 프로그래밍 언어로 표현한 문법
  	- 클래스는 해당 객체의 설계도 역할을 한다
  	- 클래스는 정의한 시점에서는 실체(instance)가 없다 
  	- 클래스라는 설계도를 통해 만들어내는 실체 객체를 '인스턴스(instance)' 라고 부른다
  	- 클래스를 통해 인스턴스를 생성할 때 new를 사용한다 -> '책 하나가 생겼다는 뜻'
  	- 같은 패키지 내부에는 같은 이름의 클래스를 정의할 수 없다
 */
	
	public static void main(String[] args) {
		
		//new를 통해 인스턴스를 찍어낼 수 있다
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.price = 35000;
		book1.page = 350;
		book1.currPage = 10;
		
		House house = new House(0, null);
		
		house.floor = 24;
		house.color = "beige";
		house.capacity = 32;
		

		System.out.println(house.floor + "층");
		
		house.changeColor("blue");
		System.out.println(house.color);
		
		System.out.println(book1.price);
		
		book1.nextPage();
		book2.nextPage();
		System.out.println(book1.currPage);
		System.out.println(book2.currPage);
		
/*
 연습문제: 현실에 존재하는 객체를 하나 참고하여 클래스를 하나 생성한 후 
  		인스턴스를 생성하고 해당 인스턴스의 상태를 출력해보세요
  		
  	* 인스턴스 변수 3개 이상, 인스턴스 메서드 2개 이상 (책 금지)
 */
		
		
		
		
	}
	
}
