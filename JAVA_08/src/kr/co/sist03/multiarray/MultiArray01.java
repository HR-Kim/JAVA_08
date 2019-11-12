package kr.co.sist03.multiarray;

import org.apache.log4j.Logger;

public class MultiArray01 {

	static final Logger LOG = Logger.getLogger(MultiArray01.class); 
	public static void main(String[] args) {
		int  [][]score={ 	
							 {100,100,100}
							,{20,20,20}
							,{30,30,30}
							,{40,40,40}
			            };	
		int sum = 0;
		LOG.debug("За:"+score.length);
		LOG.debug("ї­:"+score[0].length);
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				//LOG.debug(score[i][j]);
				//System.out.printf("[%d,%d]",i,j);
				System.out.printf("[%3d]",score[i][j]);
			}
			System.out.println("");
		}

	}
//	[0,0][0,1][0,2]
//	[1,0][1,1][1,2]
//	[2,0][2,1][2,2]
//	[3,0][3,1][3,2]
	
//	[100][100][100]
//	[ 20][ 20][ 20]
//	[ 30][ 30][ 30]
//	[ 40][ 40][ 40]	
}





