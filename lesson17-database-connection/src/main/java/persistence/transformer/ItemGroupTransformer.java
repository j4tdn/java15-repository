package persistence.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import persistence.ItemDto;
import persistence.ItemGroupDto;

public class ItemGroupTransformer {
	private ItemGroupTransformer() {
	}
	
	public static ItemGroupDto transform(ResultSet rs) throws SQLException {
		return new ItemGroupDto(
				rs.getInt("MaLH"), 
				rs.getString("TenLH"), 
				rs.getInt("SoLuong"),
				Pattern.compile(",")
					.splitAsStream(rs.getString("DanhSachMatHang"))
					.map(ItemDto::convert)
					.collect(Collectors.toList()));
		
	}
}
