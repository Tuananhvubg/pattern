package template_pattern_boec_tmd;

public class KingCrabPlatform extends BoEC_Payment_Engine{

	@Override
	void buildCart() {
		// TODO Auto-generated method stub
		System.out.println("King Crab only shells fresh seafoods.");
	}

	@Override
	void addAddress() {
		// TODO Auto-generated method stub
		System.out.println("King Crab only support country codes in Ha Noi");
	}

	@Override
	void addPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("King Crab only accepts VISA/MasterCard");
	}

}
