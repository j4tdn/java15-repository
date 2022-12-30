package dao;

import java.time.LocalDate;

public interface OrderDao {
	// 18.12.2020, 99
	void update(LocalDate deliveryDate, double deliveryFee);
}
