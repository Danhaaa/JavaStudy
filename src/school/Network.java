package school;

import java.util.Random;

public class Network extends Subject {

		
		int kor;
		int math;
		int linux;
		int network;
		int ccna;
		
		
		public Network() {
			kor = ran.nextInt(101);
			math = ran.nextInt(101);
			linux = ran.nextInt(101);
			network = ran.nextInt(101);
			ccna = ran.nextInt(101);
			
		}
		
		public Network(int kor, int math, int linux, 
				int network, int ccna) {
			this.kor = kor;
			this.math = math;
			this.linux = linux;
			this.network = network;
			this.ccna = ccna;
		}
		
		@Override
		public int getTotal() {
			return kor + math + linux 
					+ network + ccna;
		}
			
		@Override
		public double getAvg() {
			return getTotal() / 6.0;
		}
		@Override
		public char getGrade() {
			double avg = getAvg();
			if(avg >= 90) {
				return 'A';
			} else if(avg >= 80) {
				return 'B';
			}else if(avg >= 70) {
				return 'C';
			}else if(avg >= 60) {
				return 'D';
			}else {
				return 'F';
			}
		}
		
		@Override
		public String[] getSubjectNames() {
			return new String[] {"국어", "영어", "수학", "프로그래밍 언어", "운영체제",
					"자료구조"};
			}
		
		@Override
		public int[] getSubjectScores() {
			return new int[] {kor, math, linux, 
					network, ccna};
		}
			
		}
	

