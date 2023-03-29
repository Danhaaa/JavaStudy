package myobj;

public class VacuumCleaner extends Electronics{

	public VacuumCleaner() {
		super("진공 청소기", 25000);
	}
	
	public void replaceFilter() { // 청소기에만 있어야하는 기능 
		System.out.println("진공 청소기의 필터를 새 것으로 교환했습니다.");
	}
	
	
	@Override
	public void start() {
		System.out.println("원하는 곳을 잘 청소하기 시작했습니다.");
	}
	
	
}
