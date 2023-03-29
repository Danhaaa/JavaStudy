package quiz;

/*
  
 B10의 구구단 두 개를 while문으로 출력해보세요.
  
 */

public class B11_Gugudan {

	public static void main(String[] args) {
		
		// 1번. 구구단을 다음과 같이 가로로 출력해보세요.
		int dan = 1;
		int gop = 1;
	
		
		while(++dan <= 9) {
			System.out.printf(" %d단: ", dan);
			
			while(gop <= 9) {
				System.out.printf(" %dX%d=%2d ", dan, gop, dan*gop);
				gop++;
				
			if(gop == 10) {
				System.out.println();
			}
				} gop = 1;
			
			}
		//2번. 구구단을 다음과 같이 세로로 출력해보세요.
		
		int line = 0;
		while(line < 10) {
			dan = 2;
			while (dan <= 9) {
				if (line == 0) {
					System.out.printf("%d단\t", dan);
				}else {
					System.out.printf("%dx%d=%d\t",dan, line, dan*line);
				}
				++dan;
			}
			++line;
			System.out.println();
		}
		
		
		}
		
		}

	
	


