/**
 * 實作時間記錄：
 * 日期：<07/17>: <01:00>~<02:18>: <01:18>
 * 日期：<07/18>: <01:30>~<02:00>: <00:30>
 * 程式目標：使用Math.random()，產生0到9的亂數，並計算在執行10次，100次，1000次的情形
 * 設計規格：BigDecimal,iHitCnts,iNum,dblPercent
 * 設計想法：輸出0~9的亂數並計算出現比率
 * 虛擬碼：建構一個長度為10的陣列iHitCnts，儲存各數字的產生次數
 *       for迴圈產生0~9的數字
 *       將對應位置的數字+1
 *       for迴圈計算每一個數字的比率
 *       計算數字比率並利用BigDecimal將結果取到小數第二位
 *       將每個數字的比率輸出
 *  
 */
package practice;
import java.math.BigDecimal;
/**
 * @author ACER
 *
 */
public class J001 {
	public static void main(String[] args){
		//建構一個長度為10的陣列iHitCnts，儲存各數字的產生次數
		int[] iHitCnts = new int[10];
		//for迴圈產生0~9的數字
		for(int id = 0; id < 1000; id++){
			
			int iNum = (int)(10 * Math.random());
			//將對應位置的數字+1
			iHitCnts[iNum]++;
		}
		//for迴圈計算每一個數字的比率
		for(int id = 0; id < iHitCnts.length; id++){
			//計算數字比率並利用BigDecimal將比率結果取到小數第二位
			double dblPercent = new BigDecimal(100.0 * (iHitCnts[id] / 1000.0)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			//將每個數字的比率輸出
			System.out.println("數字：" + id + " 出現比率：" + dblPercent);
		}
		
	}

}
