package BridgeDesign;

//Refined Abstraction
public class NetBanking extends Payment
{

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		
		payment.ProcessPayment("Net Banking");
	}
}
