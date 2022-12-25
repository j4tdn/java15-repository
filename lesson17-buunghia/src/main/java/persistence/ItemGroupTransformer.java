package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemGroupTransformer {
	private ItemGroupTransformer() {}
	public static ItemGroup transform(ResultSet rs) throws SQLException {
		String itemAsString = rs.getString("DanhSachMatHang");
		
		return null;
	}
}
