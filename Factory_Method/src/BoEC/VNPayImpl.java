package BoEC;

public class VNPayImpl implements Payments{

		@Override
		public PaymentMethod makePayment() {
			String paymentMethod = "VNPAY";
			PaymentMethod VNPayPayment = new PaymentMethod(paymentMethod);
			return VNPayPayment;
		}
	}


