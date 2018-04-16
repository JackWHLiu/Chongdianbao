/**
 * 方向。
 * 
 * @author liuwenhao
 */
public interface Direct {
	
	/**
	 * 逆时针旋转。
	 * 
	 * @param current
	 * @return
	 */
	Direct contrarotate();
	
	/**
	 * 顺时针旋转。
	 * 
	 * @param current
	 * @return
	 */
	Direct rotate();
	
	/**
	 * 是否有方向。
	 * 
	 * @return
	 */
	boolean hasDirect();
	
	/**
	 * 得到方向的类型。
	 * 
	 * @return
	 */
	int getDirectType();
	
	/**
	 * 打印方向信息。
	 * 
	 * @return
	 */
	String print();
}
