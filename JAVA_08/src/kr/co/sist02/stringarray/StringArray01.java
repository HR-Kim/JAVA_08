package kr.co.sist02.stringarray;

import org.apache.log4j.Logger;

public class StringArray01 {
//String �迭
//String[] name =new String[3];
//String �ʱⰪ null
//name[0]="KIM";//	name[0]=new String("KIM");
//name[1]="LEE";//	name[1]=new String("LEE");
	static final Logger  LOG=Logger.getLogger(StringArray01.class);
	public static void main(String[] args) {
		//String[] name=new String[] {"KIM","LEE","PARK"};
		String[] name={"KIM","LEE","PARK"};
		//System.out.println() == LOG.debug()
		for(int i=0;i<name.length;i++) {
			LOG.debug("name["+i+"]:"+name[i]);
		}
		
		name[2]="YU";
		//���� for
		for(String str:name) {
			LOG.debug(str);
		}
		

	}

}
