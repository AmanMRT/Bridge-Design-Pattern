package BridgeDesign;

public class PaymentProcessor {

	public static void main(String[] args)
	{
		//Using PNB payment gateway for Credit Card Payment
		Payment order1 = new CardPayment();
		order1.payment = new PNBpaymentSystem();
		order1.makePayment();
		
		//Using PNB payment gateway for Debit Card Payment
		Payment order12 = new CardPayment();
		order12.payment = new PNBpaymentSystem();
		order12.makePayment();
		
		//Using PNB payment gateway for Net Banking
		Payment order11 = new NetBanking();
		order11.payment = new PNBpaymentSystem();
		order11.makePayment();
		
		//User will Pay on Delivery
		Payment order111 = new PayOnDelivery();
		order111.payment = new PNBpaymentSystem();	//Pay on Delivery is irrespective of banks
		order111.makePayment();
		
		//Using same payment gateway with different bank
		
		//Using SBI payment gateway for Credit Card Payment
		Payment order2 = new CardPayment();
		order2.payment = new SBIpaymentSystem();
		order2.makePayment();

		//Using SBI payment gateway for Debit Card Payment
		Payment order21 = new CardPayment();
		order21.payment = new SBIpaymentSystem();
		order21.makePayment();
		
		//Using SBI payment gateway for Net Banking
		Payment order22 = new NetBanking();
		order22.payment = new SBIpaymentSystem(); 
		order22.makePayment();
		
		//User will Pay on Delivery
		Payment order222 = new PayOnDelivery();
		order222.payment = new SBIpaymentSystem();	//Pay on Delivery is irrespective of banks
		order222.makePayment();
		
	}
}
