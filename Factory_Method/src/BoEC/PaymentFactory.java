package BoEC;

public class PaymentFactory {
	private PaymentFactory() {
		
	}
	public static Payments createPayment(PaymentType paymenType) {
		switch (paymenType) {
		case COD: {
			return new CODPaymentImpl();
		}
		case VNPAY:
			return new VNPayImpl();
		}
		return null;
	}
}
