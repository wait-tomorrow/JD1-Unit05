package by.htp.BasicOOP.Task02;

/*
 * Задача 2. 
 * Создать класс Payment с внутренним классом, 
 * с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */

public class Task02 {

    public static void main(String[] args) {
	Payment payment = new Payment();

	payment.add("Молоко", 1.39);
	payment.add("Колбаса", 5.76);
	payment.add("Сыр", 2.45);

	print(payment);
	System.out.println("Сумма чека: " + PaymentLogic.calculateTotalPrice(payment));
    }

    public static void print(Payment payment) {
	for (Payment.Item item : payment.getItems()) {
	    System.out.println(item.getItemName() + " " + item.getPrice());
	}
    }
}
