package service;

import java.time.LocalDate;

public interface OrderService {
	// 18.12.2020, 99
	void update(LocalDate deliveryDate, double deliveryFee);
}
