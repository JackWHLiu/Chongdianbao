
public class Contrarotate implements PositionTendency {

	@Override
	public int transformIndex(int originIndex, Class<? extends AbsButton> buttonClass) {
		if (LeftDownButton.class.isAssignableFrom(buttonClass)) {
			if (originIndex == 3) {
				return 6;
			} else if (originIndex == 4) {
				return 3;
			} else if (originIndex == 6) {
				return 7;
			} else if (originIndex == 7) {
				return 4;
			} else {
				return originIndex;
			}
		}
		if (LeftUpButton.class.isAssignableFrom(buttonClass)) {
			if (originIndex == 1) {
				return 0;
			} else if (originIndex == 4) {
				return 1;
			} else if (originIndex == 0) {
				return 3;
			} else if (originIndex == 3) {
				return 4;
			} else {
				return originIndex;
			}
		}
		if (RightDownButton.class.isAssignableFrom(buttonClass)) {
			if (originIndex == 5) {
				return 4;
			} else if (originIndex == 8) {
				return 5;
			} else if (originIndex == 7) {
				return 8;
			} else if (originIndex == 4) {
				return 7;
			} else {
				return originIndex;
			}
		}
		if (RightUpButton.class.isAssignableFrom(buttonClass)) {
			if (originIndex == 1) {
				return 4;
			} else if (originIndex == 4) {
				return 5;
			} else if (originIndex == 2) {
				return 1;
			} else if (originIndex == 5) {
				return 2;
			} else {
				return originIndex;
			}
		}
		throw new RuntimeException("未知的按钮类型");
	}
}
