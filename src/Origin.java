import java.util.ArrayList;

public class Origin extends CellBox {

	public Origin clickBy(AbsButton button) {
		return (Origin) button.click(this);
	}

	@Override
	public ArrayList<Cell> initCells() {
		ArrayList<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(new NoneDirect(), 0));
		cells.add(new Cell(new NoneDirect(), 1));
		cells.add(new Cell(new NoneDirect(), 2));
		cells.add(new Cell(new NoneDirect(), 3));
		cells.add(new Cell(DirectStrategyA.DOWN, 4));
		cells.add(new Cell(DirectStrategyA.LEFT, 5));
		cells.add(new Cell(new NoneDirect(), 6));
		cells.add(new Cell(DirectStrategyA.RIGHT, 7));
		cells.add(new Cell(new NoneDirect(), 8));
		return cells;
	}

	@Override
	public int getCellsNum() {
		return 9;
	}
}
