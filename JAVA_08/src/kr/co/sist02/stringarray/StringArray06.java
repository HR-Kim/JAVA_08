package kr.co.sist02.stringarray;

import org.apache.log4j.Logger;

public class StringArray06 {
//8 + 10 -> 18
	static Logger LOG = Logger.getLogger(StringArray06.class);
	public static void main(String[] args) {
		//LOG.debug("args.length:"+args.length);
		if(args.length != 3) {
			LOG.debug("usage: ���ڸ� 3�� �Է� ex) 8 + 10");
			System.exit(0);
			//return;
		}

		int num01 = Integer.parseInt(args[0]);//ù��° ����
		char op   = args[1].charAt(0);//�����ȣ
		int num02 = Integer.parseInt(args[2]);//����° ����
		
		int result  = 0;
		
		switch(op) {//+,-,*,/
			case '+':
				result = num01 + num02;
				break;
			case '-':
				result = num01 - num02;
				break;				
			case 'x':
				result = num01 * num02;
				break;	
			case '/':
				result = num01 / num02;
				break;	
			default:
				LOG.debug("�������� �ʴ� ���� �Դϴ�.");
				break;
				
		}//--switch
		
		
		LOG.debug("result:"+result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
