package kr.co.sist01.log4j;

import org.apache.log4j.Logger;

public class Log4J01 {
	static Logger LOG=Logger.getLogger(Log4J01.class);
	
	public static void main(String[] args) {
		LOG.debug("====================");
		LOG.debug("Hello, world.");
		LOG.debug("====================");

	}

}
