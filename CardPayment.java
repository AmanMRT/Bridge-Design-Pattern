package BridgeDesign;

//Refined Abstraction
public class CardPayment extends Payment
{

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		
		payment.ProcessPayment("Card Payment");
	}
}
