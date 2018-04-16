/**
 * 格子。
 * 
 * @author liuwenhao
 */
public class Cell implements RotatableCell {
	
	/**
	 * 格子的方向。
	 */
	private Direct mDirect;
	
	/**
	 * 格子的位置，A-I，index的取值范围为0~8。
	 */
	private int mPosition;
	
	/**
	 * 默认以逆时针方向自转，游戏是这样。
	 */
	private int mRotation = CONTRAROTATE;

	public Cell(Direct direct, int position) {
		this.mDirect = direct;
		this.mPosition = position;
	}
	
	public Cell(Direct direct, int position, int rotation) {
		this(direct, position);
		this.mRotation = rotation;
	}

	public Direct getDirect() {
		return mDirect;
	}
	
	public void setRotation(int rotation) {
		this.mRotation = rotation;
	}
	
	public int getRotation() {
		return mRotation;
	}
	
	public void setPosition(int position) {
		this.mPosition = position;
	}

	public int getPosition() {
		return mPosition;
	}
	
	@Override
	public String print() {
		return " " + mDirect.print() + " ";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cell) {
			Cell cell = (Cell) obj;
			if (cell.mDirect instanceof NoneDirect && mDirect instanceof NoneDirect) {
				return true;
			} else {
				return cell.mDirect.equals(mDirect);
			}
		}
		return super.equals(obj);
	}
	
	@Override
	public void contrarotate() {
		mDirect = mDirect.contrarotate();
	}

	@Override
	public void rotate() {
		mDirect = mDirect.rotate();
	}

	@Override
	public boolean isIndexValid() {
		return mPosition >= 0 && mPosition < 9;
	}

	@Override
	public void performTransform() {
		if (mRotation == ROTATE) {
			rotate();
		}
		if (mRotation == CONTRAROTATE) {
			contrarotate();
		}
	}
}
