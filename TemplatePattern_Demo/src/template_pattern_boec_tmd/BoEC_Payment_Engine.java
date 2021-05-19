package template_pattern_boec_tmd;

public abstract class BoEC_Payment_Engine {

	abstract void buildCart();
	abstract void addAddress();
	abstract void addPaymentDetails();
	
	public final void pay(){
		try {
			buildCart();
			addAddress();
			addPaymentDetails();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			//	Do something when cleanup
		}
	}
	
}
