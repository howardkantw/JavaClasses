/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <02:30>~<03:10>: <00:40>
 * 程式目標：用helloer取代runner使用public void main
 * 設計規格：用helloer取代runner輸出"I’m a helloer."
 * 設計想法：
 * 虛擬碼：設定Speak方法
 *       在main中創建實體helloer
 *       呼叫自己的Speak方法
 *  
 */

public class Helloer {
	//設定Speak方法
	public void Speak(){
		
		System.out.println("I’m a helloer.");
		
	}

	
	public static void main(String[] args) {
		//在main中創建實體helloer
		Helloer helloer = new Helloer();
		//呼叫自己的Speak方法
		helloer.Speak();

	}

}
