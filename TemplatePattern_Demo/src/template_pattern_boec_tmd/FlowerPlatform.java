package template_pattern_boec_tmd;

public class FlowerPlatform extends BoEC_Payment_Engine{

	@Override
	void buildCart() {
		// TODO Auto-generated method stub
		System.out.println("Flower store only shells flower.");
	}

	@Override
	void addAddress() {
		// TODO Auto-generated method stub
		System.out.println("Flower store only support country codes in Ha Noi");
	}

	@Override
	void addPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Flower store only accepts VISA/MasterCard");
	}

}
