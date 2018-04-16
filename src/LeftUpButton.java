
public class LeftUpButton extends AbsButton {

	protected LeftUpButton(PositionTendency tendency) {
		super(tendency);
	}

	@Override
	public String print() {
		return "左上";
	}
	
	@Override
	protected Cell transformCell(Cell cell) {
		int position = cell.getPosition();
		cell.setPosition(mTendency.transformIndex(position, LeftUpButton.class));
		return cell;
	}

	@Override
	public boolean changeCellDirect(Cell cell) {
		int position = cell.getPosition();
		return position == 0 || position == 1 ||
				position == 4 || position == 4;
	}
}
