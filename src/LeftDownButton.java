public class LeftDownButton extends AbsButton {

	protected LeftDownButton(PositionTendency tendency) {
		super(tendency);
	}

	@Override
	public String print() {
		return "左下";
	}

	@Override
	protected Cell transformCell(Cell cell) {
		int position = cell.getPosition();
		cell.setPosition(mTendency.transformIndex(position, LeftDownButton.class));
		return cell;
	}

	@Override
	public boolean changeCellDirect(Cell cell) {
		int position = cell.getPosition();
		return position == 3 || position == 4 ||position == 6 || position == 7;
	}
}
