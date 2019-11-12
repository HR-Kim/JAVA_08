//import org.apache.log4j.Logger;


public class StringArray05 {
	//static Logger LOG = Logger.getLogger(StringArray05.class);
	public static void main(String[] args) {
		
		System.out.println("---------------------");
		System.out.println("args.length="+args.length);
		System.out.println("---------------------");
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
//	D:\Java_20191031\01_Java\workspace\JAVA_08\src>java StringArray05 abc 123 888
//	---------------------
//	args.length=3
//	---------------------
//	abc
//	123
//	888
}
