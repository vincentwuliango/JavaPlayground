package elegeneous.data;

public class Application {
	public static final int PROCESSORS;
	
	static {
		PROCESSORS = Runtime.getRuntime().availableProcessors();
	}
}
