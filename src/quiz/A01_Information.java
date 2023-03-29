package quiz;

public class A01_Information {
	// class 이름은 대문자로 시작, package 이름은 소문자로 시작
	// ￦ :  한글 ㄹ + 한자 
	public static void main(String[] args) {
		System.out.println("           #### 회비 정보 ####\n"
				+ "============================================\n"
				+ "\t이름\t나이\t전화번호     \t회비\n   "
				+ "============================================");
		
		System.out.println("           #### 회비 정보 ####");
		System.out.println("======================================");
		System.out.println("이름\t나이\t전화번호\t     회비\t   ");		
		System.out.println("======================================");
		System.out.println("홍길동  \"15\"  010-123-1234    ￦20,000 ");
		System.out.println("임꺽정  \"20\"  010-234-2345    ￦30,000 ");
		System.out.println("김말이  \"28\"  010-345-3456    ￦50,000 ");
		System.out.println("______________________________________");
		System.out.println("총합계                        ￦100,000");
		System.out.println("======================================");
	}

}
