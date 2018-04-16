/**
 * 虫电宝谜题。
 * 来自任天堂3DS游戏——口袋妖怪究极日月。
 * 简介：游戏是这样的，有A-I的九宫格，在九宫格的四角分别有一个按钮，即左上按钮、左下按钮、右上按钮、右下按钮。如果玩家按下四角的按钮，可以让最接近
 * 按钮的4个格子按逆时针方向移动一次，同时格子上的虫电宝也会逆时针自转一次（有90度和45度两种）。最终在有限的4步内组成要求的虫电宝排列形式，这样就
 * 可以用虫电宝来完成发电了。游戏中剧情的难度分为4种，本程序很好的兼容4个难度谜题的求解，并保持优秀的扩展性。
 * 
 * @author liuwenhao
 */
public class Chongdianbao {

	public static void main(String[] args) {
		System.out.println("口袋妖怪虫电宝谜题暴力求解");
		Origin origin = new Origin();
		System.out.println("初始:\n"+origin.toString());
		Target target = new Target();
		System.out.println("目标:\n"+target.toString());
//		AI.randomTest(origin);
		if (AI.solve(target)) {
			System.out.println("得解");
		} else {
			System.out.println("无解");
		}
	}
}
