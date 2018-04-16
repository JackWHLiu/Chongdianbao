import java.util.ArrayList;

/**
 * 九宫格。
 * A B C
 * D E F
 * G H I
 * 
 * @author liuwenhao
 */
public abstract class CellBox {
	
	private ArrayList<Cell> mCells;
	
	protected CellBox() {
		this.mCells = initCells();
	}
	
	public void reset(ArrayList<Cell> cells) {
		this.mCells = cells;
	}
	
	public ArrayList<Cell> getAllCells() {
		return mCells;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<mCells.size();i++) {
			Cell cell = seekFor(i);
			sb.append(cell.print());
			if ((i+1) % 3 == 0) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CellBox) {
			CellBox cb = (CellBox) obj;
			ArrayList<Cell> cells = cb.getAllCells();
			for (int i=0;i<getCellsNum();i++) {
				if (!cells.get(i).equals(seekFor(i))) {
					return false;
				}
			}
			return true;
		}
		return super.equals(obj);
	}

	/**
	 * 初始化格子。
	 * 
	 * @return
	 */
	public abstract ArrayList<Cell> initCells();
	
	/**
	 * 指定格子数。
	 * 
	 * @return
	 */
	public abstract int getCellsNum();
	
	/**
	 * 查找格子。
	 * 
	 * @param position 位置，0~8对应A~I。
	 * @return 格子。
	 */
	public Cell seekFor(int position) {
		if (mCells != null && mCells.size() == getCellsNum() && position >= 0
				&& position < getCellsNum()) {//保证健壮性
			return mCells.get(position);
		}
		throw new RuntimeException("获取格子失败");
	}
}
