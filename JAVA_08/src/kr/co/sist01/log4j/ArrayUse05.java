package kr.co.sist01.log4j;

import java.util.Arrays;
import org.apache.log4j.*;

public class ArrayUse05 {

	static Logger LOG=Logger.getLogger(ArrayUse05.class);
	
	public static void main(String[] args) {
		int []numArr = {3,1,4,2,0};
		//System.out.println LOG.debug
		
		LOG.debug("��������������������������������");
		LOG.debug("�� Before       ��");
		LOG.debug("��������������������������������");
		LOG.debug("�迭����:"+numArr.length);
		LOG.debug("�迭:"+Arrays.toString(numArr));

		Arrays.sort(numArr);
		LOG.debug("^�迭:"+Arrays.toString(numArr));
		
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
		
		LOG.debug("��������������������������������");
		LOG.debug("�� After        ��");
		LOG.debug("��������������������������������");
		LOG.debug("�迭����:"+numArr.length);
		LOG.debug("�迭:"+Arrays.toString(numArr));
		
		
		
		
	}
//	���� ������ ù ��° �ڷ�� �� ��° �ڷḦ, �� ��° �ڷ�� �� ��° �ڷḦ, �� ��°�� �� ��°��, �� �̷� ������ (������-1)��° �ڷ�� ������ �ڷḦ ���Ͽ� ��ȯ�ϸ鼭 �ڷḦ �����Ѵ�.
//	1ȸ���� �����ϰ� ���� ���� ū �ڷᰡ �� �ڷ� �̵��ϹǷ� 2ȸ�������� �� ���� �ִ� �ڷ�� ���Ŀ��� ���ܵǰ�, 2ȸ���� �����ϰ� ���� ������ �� ��° �ڷ������ ���Ŀ��� ���ܵȴ�. �̷��� ������ 1ȸ�� ������ ������ ���Ŀ��� ���ܵǴ� �����Ͱ� �ϳ��� �þ��.
}
