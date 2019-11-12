package kr.co.sist02.stringarray;

import org.apache.log4j.Logger;

public class StringArray02 {
//
	static Logger LOG=Logger.getLogger(StringArray02.class);
	public static void main(String[] args) {
	   char []hex = {'C','A','F','E'};
	   String []binary = {  "0000","0001","0010","0011"
						   ,"0100","0101","0110","0111"
						   ,"1000","1001","1010","1011"
						   ,"1100","1101","1110","1111"};
	   
	   String result = "";
	   for(int i=0;i<hex.length;i++) {
		   if(hex[i]>='0' && hex[i]<='9') {
			   result+=binary[hex[i]-'0'];
		   }
		   
		   if(hex[i]>='A' && hex[i]<='Z') {
			   result+=binary[hex[i]-'A'+10];
			   LOG.debug("result="+result);
		   }
	   }
	   
	   
	   LOG.debug("result="+result);
	   
	}

}
