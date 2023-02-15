package elegeneous.data;

public interface Vehicle extends Brand {
	String name = "";
	
	int wheels();
	
	default void weight() {
	}
}
