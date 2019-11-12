package kr.co.sist01.log4j;

import java.util.Arrays;
import org.apache.log4j.*;

public class ArrayUse05 {

	static Logger LOG=Logger.getLogger(ArrayUse05.class);
	
	public static void main(String[] args) {
		int []numArr = {3,1,4,2,0};
		//System.out.println LOG.debug
		
		LOG.debug("┌──────────────┐");
		LOG.debug("│ Before       │");
		LOG.debug("└──────────────┘");
		LOG.debug("배열길이:"+numArr.length);
		LOG.debug("배열:"+Arrays.toString(numArr));

		Arrays.sort(numArr);
		LOG.debug("^배열:"+Arrays.toString(numArr));
		
		for(int i=0;i<numArr.length-1;i++) {
			boolean changed = false;
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {// > ASC, < DESC
					int temp = numArr[j];
					numArr[j]= numArr[j+1];
					numArr[j+1]=temp;
					changed = true;
				}
			}//for j
			
		}//--for i
		
		LOG.debug("┌──────────────┐");
		LOG.debug("│ After        │");
		LOG.debug("└──────────────┘");
		LOG.debug("배열길이:"+numArr.length);
		LOG.debug("배열:"+Arrays.toString(numArr));
		
		
		
		
	}
//	버블 정렬은 첫 번째 자료와 두 번째 자료를, 두 번째 자료와 세 번째 자료를, 세 번째와 네 번째를, … 이런 식으로 (마지막-1)번째 자료와 마지막 자료를 비교하여 교환하면서 자료를 정렬한다.
//	1회전을 수행하고 나면 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외되고, 2회전을 수행하고 나면 끝에서 두 번째 자료까지는 정렬에서 제외된다. 이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다.
}
