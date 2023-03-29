
import myobj.KindPerson;
import myobj.Person;

public class C07_Extend {
/*
  # 클래스 상속
  - 이미 만들어져 있는 클래스를 물려받아 사용하는 문법
  - 자식 클래스는 부모 클래스의 모든 자원을 그대로 물려받는다
  - 클래스에게 물려받은 기능을 고쳐서 사용할 수도 있다
  - 부모 클래스에게 없던 기능을 새로 추가해서 사용할 수도 있다
  - 자식 클래스는 반드시 부모의 생성자를 가장 먼저 호출해야 한다
  
  # super
  - 자식 클래스로 생성된 인스턴스는 두 부분으로 분류할 수 있다
  - this는 현재 인스턴스 중 자식 클래스의 부분을 의미한다
  - super는 현재 인스턴스 중 부모 클래스의 부분을 의미한다
  - this()는 현재 클래스의 다른 생성자를 의미한다
  - super()는 부모 클래스의 생성자를 의미한다
  
  # 오버라이드 (@Override)
  
  - 부모에 이미 존재하던 메서드를 마음대로 덮어써서 사용할 수 있다
  
  연습 : myobj2 패키지 내부에 상속 관계에 있는 클래스들을 정의해보세요.
  		(오버라이드를 반드시 사용하기)
  예) 과일이 있다면 그 안에 사과, 수박 등 
  
 */
	
	public static void main(String[] args) {
		KindPerson kp1 = new KindPerson("범수", 23);
		
		kp1.sayHi();
		kp1.sayMyName();
		
		Person p1 = new Person("민수", 13);
		Person p2 = new Person("철수", 14);
		Person[]  persons = new Person[3];
		
		persons[0] = p1;
		persons[1] = p2;
		persons[2] = new Person("추신수", 22);
		
		p1.sayHi();
		p2.sayHi();
		persons[2].sayHi();
		
	}
	
}
