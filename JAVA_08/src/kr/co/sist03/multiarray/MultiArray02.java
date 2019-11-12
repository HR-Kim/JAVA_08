package kr.co.sist03.multiarray;

public class MultiArray02 {

	public static void main(String[] args) {
		int [][]score = {
							 {100,100,100}
							,{20,20,20}
							,{30,30,30}
							,{40,40,40}
							,{50,50,50}
      		            };

		int korTotal=0; //���� ����
		int engTotal=0; //���� ����
		int mathTotal=0;//���� ����
		
		System.out.println("��ȣ ���� ���� ���� ���� ���");
		System.out.println("==============================================");
		for(int i=0;i<score.length;i++) {
			int   sum = 0;//���κ� ����
			float avg = 0.0f;//���κ� ���
			
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			
			System.out.printf("%3d",i+1);
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f\n",sum,avg	);
		}//for i

		System.out.println("==============================================");
		System.out.printf("����: %3d %4d %4d\n"
				,korTotal,engTotal,mathTotal);
	}
//	��ȣ ���� ���� ���� ���� ���
//	==============================================
//	  1  100  100  100  300 100.0
//	  2   20   20   20   60  20.0
//	  3   30   30   30   90  30.0
//	  4   40   40   40  120  40.0
//	  5   50   50   50  150  50.0
//	==============================================
//	����: 240  240  240
}
