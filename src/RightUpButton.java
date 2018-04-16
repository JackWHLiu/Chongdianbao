public class RightUpButton extends AbsButton {

	protected RightUpButton(PositionTendency tendency) {
		super(tendency);
	}

	@Override
	public String print() {
		return "右上";
	}

	@Override
	protected Cell transformCell(Cell cell) {
		int position = cell.getPosition();
		cell.setPosition(mTendency.transformIndex(position, RightUpButton.class));
		return cell;
	}

	@Override
	public boolean changeCellDirect(Cell cell) {
		int position = cell.getPosition();
		return position == 1 || position == 2 || position == 4 || position == 5;
	}
}
