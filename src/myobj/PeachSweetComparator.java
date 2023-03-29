package myobj;

import java.util.Comparator;

public class PeachSweetComparator implements Comparator {

   @Override
   public int compare(Object o1, Object o2) {
       
      
      
      // return 1 : 왼쪽이 더 크다
      // return 0 : 두 인스턴스의 크기가 같다
      // return -1 : 오른쪽이 더 크다

      Peach p1 = (Peach) o1;
      Peach p2 = (Peach) o2;

      if (p1.price < p2.price) {
         return -1;
      } else if (p1.price > p2.price) {
         return 1;
      }else if (p1.sweet < p2.sweet) {
         return 1;
      } else if (p1.sweet > p2.sweet) {
         return -1;
      } else {
         return 0;
      }
   
   }
}

	

	
	

