/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <02:30>~<03:10>: <00:40>
 * �{���ؼСG��helloer���Nrunner�ϥ�public void main
 * �]�p�W��G��helloer���Nrunner��X"I��m a helloer."
 * �]�p�Q�k�G
 * �����X�G�]�wSpeak��k
 *       �bmain���Ыع���helloer
 *       �I�s�ۤv��Speak��k
 *  
 */

public class Helloer {
	//�]�wSpeak��k
	public void Speak(){
		
		System.out.println("I��m a helloer.");
		
	}

	
	public static void main(String[] args) {
		//�bmain���Ыع���helloer
		Helloer helloer = new Helloer();
		//�I�s�ۤv��Speak��k
		helloer.Speak();

	}

}
