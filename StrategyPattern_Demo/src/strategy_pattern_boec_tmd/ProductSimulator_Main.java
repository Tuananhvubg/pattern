package strategy_pattern_boec_tmd;

public class ProductSimulator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductsSimulator[] simulators = { 
				new OnSaleSimulator(new OnSaleOperaterImp()),
				new OutOfStockSimulator(new OutOfStockOperatorImp()),
				new OnUpdateSimulator(new OnUpdateOperatorImp()) 
		};

		for (ProductsSimulator simulator : simulators) {
			simulator.getOperatingStrategy().operate();
		}
	}

}
