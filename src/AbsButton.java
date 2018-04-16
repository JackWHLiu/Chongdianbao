import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 抽象的按钮。当前有4个子类，左上角的按钮、右上角的按钮、左下角的按钮、右下角的按钮。
 * 
 * @author liuwenhao
 */
public abstract class AbsButton implements Towards {
	
	/**
	 * 位置的趋势。
	 */
	protected PositionTendency mTendency;
	
	protected AbsButton(PositionTendency tendency) {
		this.mTendency = tendency;
	}
	
	/**
	 * 按钮用来点击。
	 * 
	 * @param current 当前9宫格。
	 * @return 按下按钮后的9宫格。
	 */
	public final CellBox click(CellBox current) {
		ArrayList<Cell> result = new ArrayList<Cell>();
		ArrayList<Cell> cells = current.getAllCells();
		for (Cell cell:cells) {
			if (changeCellDirect(cell)) {
				cell.performTransform();
			}
			result.add(transformCell(cell));
		}
		Collections.sort(result, new CellComparator());
		current.reset(result);
		return current;	
	}

	/**
	 * 点击按钮后，如何变化？
	 * 
	 * @param cell 按钮按下前，9宫格上某个位置的虫电宝情况。
	 * @return 按钮按下后，9宫格上某个位置的虫电宝情况。
	 */
	protected abstract Cell transformCell(Cell cell);

	/**
	 * 用来打印按钮的信息。
	 * 
	 * @return
	 */
	public abstract String print();

	/**
	 * 用来给错位的集合排序。
	 * 
	 * @author liuwenhao
	 */
	class CellComparator implements Comparator<Cell> {

		@Override
		public int compare(Cell o1, Cell o2) {
			return o1.getPosition() - o2.getPosition();
		}
	}
}
