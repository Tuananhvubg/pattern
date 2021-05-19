package template_pattern_boec_tmd;

public class PaymentEngine_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processPaymentsForKingCrab();
		processPaymentsForFlowers();
	}

	private static void processPaymentsForFlowers() {
		// TODO Auto-generated method stub
		System.out.println("------KingCrab using the BoEC payment engine-------");
		BoEC_Payment_Engine KingCrabPaymentEngine = new KingCrabPlatform();
		KingCrabPaymentEngine.pay();
		System.out.println("------KingCrab implementation completed-------\n\n\n");
	}

	private static void processPaymentsForKingCrab() {
		// TODO Auto-generated method stub
		System.out.println("------Flowers using the BoEC payment engine-------");
		BoEC_Payment_Engine FlowersPaymentEngine = new FlowerPlatform();
		FlowersPaymentEngine.pay();
		System.out.println("------Flowers implementation completed-------");
	}

}
