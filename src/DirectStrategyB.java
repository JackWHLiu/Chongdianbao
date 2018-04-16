/**
 * 方向策略B，左、上、右、下、左上、右上、左下、右下8种
 * 
 * @author liuwenhao
 */
public enum DirectStrategyB implements Direct {

	LEFT, LEFT_UP, UP, RIGHT_UP, RIGHT, RIGHT_DOWN, DOWN, LEFT_DOWN;
	
	@Override
	public Direct contrarotate() {
		if (this == LEFT) {
			return LEFT_DOWN;
		}
		if (this == LEFT_DOWN) {
			return DOWN;
		}
		if (this == DOWN) {
			return RIGHT_DOWN;
		}
		if (this == RIGHT_DOWN) {
			return RIGHT;
		}
		if (this == RIGHT) {
			return RIGHT_UP;
		}
		if (this == RIGHT_UP) {
			return UP;
		}
		if (this == UP) {
			return LEFT_UP;
		}
		if (this == LEFT_UP) {
			return LEFT;
		}
		throw new RuntimeException("不存在的");
	}

	@Override
	public Direct rotate() {
		if (this == LEFT) {
			return LEFT_UP;
		}
		if (this == LEFT_UP) {
			return UP;
		}
		if (this == UP) {
			return RIGHT_UP;
		}
		if (this == RIGHT_UP) {
			return RIGHT;
		}
		if (this == RIGHT) {
			return RIGHT_DOWN;
		}
		if (this == RIGHT_DOWN) {
			return DOWN;
		}
		if (this == DOWN) {
			return LEFT_DOWN;
		}
		if (this == LEFT_DOWN) {
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
		if (this == LEFT_UP) {
			return "↖";
		}
		if (this == RIGHT_UP) {
			return "↗";
		}
		if (this == RIGHT_DOWN) {
			return "↘";
		}
		if (this == LEFT_DOWN) {
			return "↙";
		}
		throw new RuntimeException("不存在的");
	}

	@Override
	public boolean hasDirect() {
		return true;
	}

	@Override
	public int getDirectType() {
		return 2;
	}
}
