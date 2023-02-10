package service;

import java.time.LocalDate;

public interface OrderService {
	void update(LocalDate lDate, double deliveryFee);
}
