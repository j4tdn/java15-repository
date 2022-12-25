package dao;

import java.time.LocalDate;

public interface OrderDao {
	void update(LocalDate deliveryDate, double deliveryFee);
}
