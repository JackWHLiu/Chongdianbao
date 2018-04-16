/**
 * 方向策略A，左、上、右、下4种
 * 
 * @author liuwenhao
 */
public enum DirectStrategyA implements Direct {
	
	LEFT, UP, RIGHT, DOWN;

	@Override
	public Direct contrarotate() {
		if (this == LEFT) {
			return DOWN;
		}
		if (this == UP) {
			return LEFT;
		}
		if (this == RIGHT) {
			return UP;
		}
		if (this == DOWN) {
			return RIGHT;
		}
		throw new RuntimeException("不存在的");
	}

	@Override
	public Direct rotate() {
		if (this == LEFT) {
			return UP;
		}
		if (this == UP) {
			return RIGHT;
		}
		if (this == RIGHT) {
			return DOWN;
		}
		if (this == DOWN) {
			return LEFT;
		}
		throw new RuntimeException("不存在的");
	}

	@Override
	public String print() {
		if (this == LEFT) {
			return "←";
		}
		if (this == UP) {
			return "↑";
		}
		if (this == RIGHT) {
			return "→";
		}
		if (this == DOWN) {
			return "↓";
		}
		throw new RuntimeException("不存在的");
	}

	@Override
	public boolean hasDirect() {
		return true;
	}

	@Override
	public int getDirectType() {
		return 1;
	}
}
