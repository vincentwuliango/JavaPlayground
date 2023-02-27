package elegeneous.data;

public interface Vehicle extends Brand {
	String name = "";
	
	public int wheels();
	
	default void weight() {
	}
}
