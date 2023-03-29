package game31;
/*
# 31 게임을 만들어보세요

 1. 인원은 최소 2명 이상이어야 한다
 
 2. 번갈아가면서 숫자를 선택한다
 	 (1, 2, 3)
 	 
 3. 31을 말하는 사람이 패배한다
 
*/
public class GameConfig{
	int lastNum;
	int players;
	int bound;
	
	public GameConfig(int lastNum, int players, int bound) {
		this.lastNum = lastNum;
		this.players = players;
		this.bound = bound;
	}
	
	@Override
	public String toString() {
		return "[마지막 번호 = " + lastNum + ",플레이어" + players + 
				"명, 숫자범위1~" + bound + "]";
	}
}
