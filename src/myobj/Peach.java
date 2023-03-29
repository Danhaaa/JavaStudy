package myobj;

import java.util.Random;

public class Peach implements Comparable {
   String kind; // 백/황도
   int grade; // 1~5 등급
   double sweet; // 10~20%
   int country; // 국가 코드
   String countryName;
   int price; // 가격
   
   
   // 다른 패키지에서는 수정 할 수 없도록 제어 할 수 있음 
   public int getPrice() {
      return price;      
   }
   public double getSweet() {
      return sweet;
   }
   public String getCountryName() {
      return countryName;
   }   
   private static Random r = new Random();
   
   // 중국 (86), 이탈리아(39), 스페인(34), 미국(1)
   private static int[] countryCodes = { 86, 39, 34, 1 };
   private static String[] countryNames = {"China", "Spain",
         "USA","Italy"};

   public Peach() {
      kind = r.nextBoolean() ? "백도" : "황도";
      grade = r.nextInt(5) + 1;
      sweet = r.nextDouble(10) + 10;
      
      int randomContry =  r.nextInt(countryCodes.length);
      country = countryCodes[randomContry];
      countryName = countryNames[randomContry];
      price = (r.nextInt(21) + 10) * 100;

   }
   @Override
   public String toString() {
      return String.format("[%s/%d등급/%.2f%%/%s(%d) 가격 : %d₩\n",
            kind, grade, sweet, countryName, country, price);
   }

   // copareTo : Comparable 인터페이스에 딸려있는 추상 메서드
   // 현재 인스턴스와 매개변수로 전달받은 인터페이스의 비교 결과를 정의 해놓아야한다
   
   @Override
   public int compareTo(Object o) {
      Peach p2 = (Peach) o;
      /*
       this 와 매개변수로 전달받은 인스턴스를 비교
       return 1 : this가 더 크다 (오름차순시 오른쪽으로 가야함)
       return 0 : 두인스턴스 크기가 같다
       return -1 : this가 더 작다(오름차순시 왼쪽으로 가야함)
       */
      
      if (this.grade > p2.grade) {
         return 1;
      } else if (this.grade < p2.grade) {
         return -1;
      } else {
         return 0;
      }
   }
}