package com.javaassessment.javaday2concepts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
public class Order {
	public static void main(String[] args) {

		OrderImpl orderImpl = new OrderImpl();
		OrderPojo orderPojo = new OrderPojo();

		orderPojo.setOrderName("Pizza");
		orderPojo.setOrderAmount(250);
		orderPojo.setOrderDate(LocalDate.now());

		Optional<OrderPojo> orderPojoObj = orderImpl.placeOrder(orderPojo);
		orderPojoObj = Optional.ofNullable(orderPojoObj).orElse(Optional.of(new OrderPojo()));

		if (orderPojoObj.isPresent()) {
			if (orderPojo.getOrderStatus() == ("Received")) {
				System.out.println("--Order Received--");
			}
			System.out.println("Your Order ID is: " + orderPojo.getOrderID());
			DateTimeFormatter formatTodayWithZoneId = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");
			//System.out.format("Formatted date time with zone ID of Europe is %s",orderPojo.getTimeZone().format(formatTodayWithZoneId));
			System.out.format("Order date and time is %s",orderPojo.getTimeZone().format(formatTodayWithZoneId));
		} else {
			System.out.println("Please wait for your order");
		}

	}
}
