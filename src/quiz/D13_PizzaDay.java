package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class D13_PizzaDay {
   /*
    *  실행하면 오늘로부터 1년간의 피자 데이를 모두 출력해주는 프로그램을 만드세요.
    * 
    *  파파스 데이 : 매월 18일 
    *  파파 프라이데이 : 홀수번째 금요일
    */
//   이벤트 날짜가 겹치는 경우 둘 모두 적용됨을 알려줘야함
   
   public static boolean checkPapasDay(Calendar toCheck) {
      return toCheck.get(Calendar.DATE) == 18;
   }
   
   public static boolean checkPaPaFriday(Calendar toCheck) {
      return toCheck.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY &&
            toCheck.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 1;
   }
   
   public static void printEventDays(Calendar start) {
      //Calendar event = start; // 얕은 복사
      Calendar event = (Calendar) start.clone(); //깊은 복사 (object단원에서 배움)
      SimpleDateFormat eventDayFormat = new SimpleDateFormat("yy-MM-dd E");
      
      for (int i = 0; i < 365; ++i) {
          event.add(Calendar.DATE, 1);
          System.out.print(eventDayFormat.format(event.getTime()) + " - ");
       
          if (checkPapasDay(event)) {
             System.out.print("파파스데이");
             
             
          }
          
          boolean otherEventExist = true;
          boolean eventExist = true;
          
          if (checkPaPaFriday(event)) {
          
             if (otherEventExist) {
                System.out.println(", 파파프라이데이(중복 적용 가능)");
             } else{
                System.out.println("파파프라이데이");   
             }
             eventExist = true;
          }
          
          if (!eventExist) {
             System.out.print("X");
          }
          
          
          System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Calendar today = Calendar.getInstance();
      
      printEventDays(today);
//      
      System.out.println("메서드를 실행한 후의 today: " + today.get(Calendar.YEAR));

      
   }
}