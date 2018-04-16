/**
 * 位置变化趋势。
 * 
 * @author liuwenhao
 */
public interface PositionTendency {

	int transformIndex(int originIndex, Class<? extends AbsButton> buttonClass);
}
