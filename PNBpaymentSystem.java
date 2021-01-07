package BridgeDesign;

public class PNBpaymentSystem implements paymentSystem {

	@Override
	public void ProcessPayment(String string) {
		// TODO Auto-generated method stub
		
		System.out.println("Using PNB payment gateway for "+ string);
	}

	@Override
	public void ProcessPayment() {
		// TODO Auto-generated method stub
		System.out.println("User will Pay on Delivery");
	}
}
