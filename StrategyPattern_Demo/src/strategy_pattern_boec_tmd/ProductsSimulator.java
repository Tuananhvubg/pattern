package strategy_pattern_boec_tmd;

public abstract class ProductsSimulator {
	private OperatingStrategy operatingStrategy;

	public ProductsSimulator(OperatingStrategy operatingStrategy) {
		this.operatingStrategy = operatingStrategy;
	}

	public void startEngine() {
		System.out.println("Engine started");
	}

	public void stopEngine() {
		System.out.println("Engine stopped");
	}
	
	public OperatingStrategy getOperatingStrategy() {
		return operatingStrategy;
	}
}
