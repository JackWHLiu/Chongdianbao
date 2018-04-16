
public class Static implements PositionTendency {

	@Override
	public int transformIndex(int originIndex, Class<? extends AbsButton> buttonClass) {
		return originIndex;
	}
}
