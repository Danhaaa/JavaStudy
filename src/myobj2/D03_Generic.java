package myobj2;

/*
      # 제네릭 (Generic)
         
         - 클래스를 정의할 때 나중에 타입을 지정 할 수 있도록 설계하는것
         
         - 클래스 이름 옆에 <>를 사용해 제네릭명을 지정해 둘 수 있다
    
          - 인스턴스 생성시 해당 타입을 지정해 줄 수 있다
 
          - 제네릭에는 기본형 타입을 사용 할 수 없다
          
          (Integer, Charcter, Double, Float, boolean ...)      
 */
public class D03_Generic {

   public static void main(String[] args) {
      // 인스턴스를 생성하며 정의해 두었던 타입을 결정 할 수 있다

      MyCollection<String> myList = new MyCollection<>();
      MyCollection<Character> myList2 = new MyCollection<>();

      myList.add("airplane0");
      myList.add("airplane1");
      myList.add("airplane2");

      myList2.add('a');

      System.out.println(myList.get(0));
      System.out.println(myList.get(0));

   }
}
