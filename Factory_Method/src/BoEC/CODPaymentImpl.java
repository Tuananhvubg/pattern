package BoEC;

public class CODPaymentImpl implements Payments{

	@Override
	public PaymentMethod makePayment() {
		String paymentMethod = "COD";
		PaymentMethod codPayment = new PaymentMethod(paymentMethod);
		return codPayment;
	}
}
	