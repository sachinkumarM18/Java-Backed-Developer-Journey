
package com.mini_ecommerce_jdbc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mini_ecommerce_jdbc.model.PaymentStatus;

public class PaymentStatusModelTest {

	@Test
	void shouldContainAllPaymentStatuses() {

		PaymentStatus[] statuses = PaymentStatus.values();
 
		assertEquals(4, statuses.length);

		assertNotNull(PaymentStatus.PENDING);
		assertNotNull(PaymentStatus.PAID);
		assertNotNull(PaymentStatus.FAILED);
		assertNotNull(PaymentStatus.REFUNDED);
	}

	@Test
	void shouldReturnCorrectPaymentStatus() {

		assertEquals(PaymentStatus.PENDING, PaymentStatus.valueOf("PENDING"));
		assertEquals(PaymentStatus.PAID, PaymentStatus.valueOf("PAID"));
		assertEquals(PaymentStatus.FAILED, PaymentStatus.valueOf("FAILED"));
		assertEquals(PaymentStatus.REFUNDED, PaymentStatus.valueOf("REFUNDED"));
	}
}