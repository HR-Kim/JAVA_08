package kr.co.sist02.stringarray;

import org.apache.log4j.Logger;
 
public class StringArray04 {
//SOSHELP to 모르스부호
	static Logger LOG = Logger.getLogger(StringArray04.class);
	public static void main(String[] args) {
		String source ="SOSHELP";
		String[] morse = {".－"
				,"－..."
				,"－.－."
				,"－.."
				," ."
				," ..－."
				,"－－."
				,"...."
				,".."
				,".－－－"
				,"－.－"
				,".－.."
				,"－－"
				,"－."
				,"－－－"
				,".－－."
				,"－－.－"
				,".－."
				,"..."
				,"－"
				,"..－"
				,"...－"
				,".－－"
				,"－..－"
				,"－.－－"
				,"－－.."};
		
		String result = "";
		
		//'S' - 'A' -> 배열Index
		for(int i=0;i<source.length();i++) {
			result+=morse[source.charAt(i)-'A']+"\t";
		}
		
		LOG.debug("source:"+source);
		LOG.debug("result:"+result);
		
	}
//	2019-11-12 14:36:30,222 DEBUG [main] stringarray.StringArray04 (StringArray04.java:44)     - source:SOSHELP
//	2019-11-12 14:36:30,224 DEBUG [main] stringarray.StringArray04 (StringArray04.java:45)     - result:...	－－－	...	....	 .	.－..	.－－.
}











