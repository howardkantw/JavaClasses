/**
 * ��@�ɶ��O���G
 * ����G<07/17>: <01:00>~<02:18>: <01:18>
 * ����G<07/18>: <01:30>~<02:00>: <00:30>
 * �{���ؼСG�ϥ�Math.random()�A����0��9���üơA�íp��b����10���A100���A1000��������
 * �]�p�W��GBigDecimal,iHitCnts,iNum,dblPercent
 * �]�p�Q�k�G��X0~9���üƨíp��X�{��v
 * �����X�G�غc�@�Ӫ��׬�10���}�CiHitCnts�A�x�s�U�Ʀr�����ͦ���
 *       for�j�鲣��0~9���Ʀr
 *       �N������m���Ʀr+1
 *       for�j��p��C�@�ӼƦr����v
 *       �p��Ʀr��v�çQ��BigDecimal�N���G����p�ƲĤG��
 *       �N�C�ӼƦr����v��X
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
		//�غc�@�Ӫ��׬�10���}�CiHitCnts�A�x�s�U�Ʀr�����ͦ���
		int[] iHitCnts = new int[10];
		//for�j�鲣��0~9���Ʀr
		for(int id = 0; id < 1000; id++){
			
			int iNum = (int)(10 * Math.random());
			//�N������m���Ʀr+1
			iHitCnts[iNum]++;
		}
		//for�j��p��C�@�ӼƦr����v
		for(int id = 0; id < iHitCnts.length; id++){
			//�p��Ʀr��v�çQ��BigDecimal�N��v���G����p�ƲĤG��
			double dblPercent = new BigDecimal(100.0 * (iHitCnts[id] / 1000.0)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			//�N�C�ӼƦr����v��X
			System.out.println("�Ʀr�G" + id + " �X�{��v�G" + dblPercent);
		}
		
	}

}
