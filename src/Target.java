import java.util.ArrayList;

public class Target extends CellBox {
	
	@Override
	public ArrayList<Cell> initCells() {
		ArrayList<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(new NoneDirect(), 0));
		cells.add(new Cell(new NoneDirect(), 1));
		cells.add(new Cell(new NoneDirect(), 2));
		cells.add(new Cell(new NoneDirect(), 3));
		cells.add(new Cell(DirectStrategyA.DOWN, 4));
		cells.add(new Cell(new NoneDirect(), 5));
		cells.add(new Cell(DirectStrategyA.DOWN, 6));
		cells.add(new Cell(new NoneDirect(), 7));
		cells.add(new Cell(DirectStrategyA.DOWN, 8));
		return cells;
	}

	@Override
	public int getCellsNum() {
		return 9;
	}
}
