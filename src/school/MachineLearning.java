package school;

public class MachineLearning extends Subject {

	int kor;
	int eng;
	int math;
	int statistics;
	int programmingLanguage;
	int sql;
	
	public MachineLearning() {
		kor = ran.nextInt(101);
		math = ran.nextInt(101);
		eng = ran.nextInt(101);
		statistics = ran.nextInt(101);
		programmingLanguage = ran.nextInt(101);
		sql = ran.nextInt(101);
	}	
	
		public MachineLearning(int kor, int eng, int math, int statistics, 
				int programmingLanguage, int sql) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.programmingLanguage = programmingLanguage;
			this.sql = sql;	
	}

		@Override
		public int getTotal() {
			return kor + eng + math + programmingLanguage + sql;
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
		
		public String[] getSubjectNames() {
			return new String[] {"국어", "영어", "수학", "프로그래밍 언어", 
					"SQL"};
		}
		
		@Override
		public int[] getSubjectScores() {
			return new int[] {kor, eng, math, programmingLanguage, sql};
		
		
		}
}
