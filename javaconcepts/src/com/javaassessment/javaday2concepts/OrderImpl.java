package com.javaassessment.javaday2concepts;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.Random;
public class OrderImpl {
	int generateorderId() {
		Random rd = new Random();
		return rd.nextInt(1000);
	}

	Optional<OrderPojo> placeOrder(OrderPojo orderPojo) {

		Optional<String> empty = Optional.empty();
		Optional<OrderPojo> orderPojoObj = Optional.of(orderPojo);

		LocalDateTime today= LocalDateTime.now(ZoneId.of("Europe/London"));
		ZoneId timeZone = ZoneId.of("Europe/London");
		ZonedDateTime todayWithTimeZone = ZonedDateTime.of(today, timeZone);
		

		orderPojo.setOrderStatus("Received");
		orderPojo.setOrderID(generateorderId());
		orderPojo.setTimeZone(todayWithTimeZone);

		return orderPojoObj;
	}
}
