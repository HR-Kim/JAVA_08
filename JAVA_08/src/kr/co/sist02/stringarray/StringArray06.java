package kr.co.sist02.stringarray;

import org.apache.log4j.Logger;

public class StringArray06 {
//8 + 10 -> 18
	static Logger LOG = Logger.getLogger(StringArray06.class);
	public static void main(String[] args) {
		//LOG.debug("args.length:"+args.length);
		if(args.length != 3) {
			LOG.debug("usage: 인자를 3개 입력 ex) 8 + 10");
			System.exit(0);
			//return;
		}

		int num01 = Integer.parseInt(args[0]);//첫번째 인자
		char op   = args[1].charAt(0);//연산기호
		int num02 = Integer.parseInt(args[2]);//세번째 인자
		
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
				LOG.debug("지원도지 않는 연산 입니다.");
				break;
				
		}//--switch
		
		
		LOG.debug("result:"+result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
