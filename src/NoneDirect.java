
public class NoneDirect implements Direct {

	@Override
	public Direct contrarotate() {
		return this;
	}

	@Override
	public Direct rotate() {
		return this;
	}

	@Override
	public boolean hasDirect() {
		return false;
	}

	@Override
	public String print() {
		return "#";
	}

	@Override
	public int getDirectType() {
		return 0;
	}
}
