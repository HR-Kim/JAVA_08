package kr.co.sist02.stringarray;

import org.apache.log4j.Logger;

public class StringArray03 {
//String vs char []charArr
//char[]�迭�� �������� ����� �߰� String	
	static Logger LOG = Logger.getLogger(StringArray03.class);
	public static void main(String []args) {
		String src ="ABCDE";
		
		for(int i=0;i<src.length();i++) {
			char ch =src.charAt(i);
			LOG.debug(ch);
		}
		
		//String�� char []
		char[] chArr=src.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			LOG.debug(chArr[i]);
		}
		System.out.println(chArr);
		//LOG.debug(chArr+"");
	}
}









