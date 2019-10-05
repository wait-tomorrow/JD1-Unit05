package by.htp.BasicOOP.Task02;

import by.htp.BasicOOP.Task02.Payment.Item;

public class PaymentLogic {

    public static double calculateTotalPrice(Payment payment) {
	double totalPrice = 0;
	for (Item pay : payment.getItems()) {
	    totalPrice = totalPrice + pay.getPrice();
	}

	return totalPrice;
    }
}
