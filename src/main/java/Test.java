import org.apache.log4j.Logger;


public class Test {

	 private static final Logger logger = Logger.getLogger(Test.class);
	 
		public static void ciao(boolean c) {
			if(c) logger.info("vero");
			else logger.info("falso");
		}
	
	public static void main(String[] args) {
		
		ciao(true);
		
		
	}
	
	
}
