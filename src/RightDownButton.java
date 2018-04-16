public class RightDownButton extends AbsButton {

	protected RightDownButton(PositionTendency tendency) {
		super(tendency);
	}

	@Override
	public String print() {
		return "右下";
	}

	@Override
	protected Cell transformCell(Cell cell) {
		int position = cell.getPosition();
		cell.setPosition(mTendency.transformIndex(position, RightDownButton.class));
		return cell;
	}

	@Override
	public boolean changeCellDirect(Cell cell) {
		int position = cell.getPosition();
		return position == 4 || position == 5 || 
				position == 7 || position == 8;
	}
}
