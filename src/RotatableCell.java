/**
 * 可旋转的格子
 * 
 * @author liuwenhao
 */
public interface RotatableCell {
	
	int NO_ROTATION = 0;
	int ROTATE = 1;
	int CONTRAROTATE = 2;
	
	/**
	 * 打印格子的信息。
	 * 
	 * @return
	 */
	String print();
	
	/**
	 * 执行变化。
	 */
	void performTransform();
	
	/**
	 * 逆时针旋转。
	 */
	void contrarotate();
	
	/**
	 * 顺时针旋转。
	 */
	void rotate();
	
	/**
	 * 索引位置是否有效。
	 * 
	 * @return
	 */
	boolean isIndexValid();
}
