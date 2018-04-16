import java.util.Random;

/**
 * AI算法。
 * 
 * @author liuwenhao
 */
public class AI {
	
	/**
	 * 游戏中格子以逆时针移动，所以也以此方式模拟。
	 */
	private static AbsButton[] buttons = new AbsButton[] {
			new LeftUpButton(new Contrarotate()),
			new RightUpButton(new Contrarotate()),
			new RightDownButton(new Contrarotate()),
			new LeftDownButton(new Contrarotate())
	};
	
	/**
	 * 随机测试。
	 * 
	 * @param origin 原9宫格。
	 */
	public static void randomTest(Origin origin) {
		int m = new Random().nextInt(4);
		AbsButton button = buttons[m];
		System.out.println("按"+button.print()+"后:\n"+origin.clickBy(button));
	}
	
	/**
	 * 暴力求解。
	 * 
	 * @param target 目标9宫格。
	 * @return 是否得出解。
	 */
	public static boolean solve(Target target) { 
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				for (int k=0;k<4;k++) {
					for (int l=0;l<4;l++) {
						Origin origin = new Origin();
						origin.clickBy(buttons[i])
						.clickBy(buttons[j])
						.clickBy(buttons[k])
						.clickBy(buttons[l]);
						if (origin.equals(target)) {
							Origin temp = new Origin();//还原破解过程
							System.out.println("第1次:"+buttons[i].print());
							System.out.println(temp.clickBy(buttons[i]).toString());
							System.out.println("第2次:"+buttons[j].print());
							System.out.println(temp.clickBy(buttons[j]).toString());
							System.out.println("第3次:"+buttons[k].print());
							System.out.println(temp.clickBy(buttons[k]).toString());
							System.out.println("第4次:"+buttons[l].print());
							System.out.println(temp.clickBy(buttons[l]).toString());
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
